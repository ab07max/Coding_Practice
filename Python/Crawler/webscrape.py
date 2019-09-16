import bs4
from urllib.request import urlopen as uReq
from bs4 import BeautifulSoup as soup
from time import gmtime, strftime

baseurl = "http://mortgage.dzot.com/"
myurl = "http://mortgage.dzot.com/index.php?find="

uClient = uReq(myurl)
myhtml = uClient.read()
uClient.close()

page_soup = soup(myhtml, "html.parser")
states = page_soup.find("table", {"align": "center"}).findAll("a")

actual_time = strftime("%Y-%m-%d %H-%M-%S", gmtime())
f = open("Mortgages - " + str(actual_time) + ".csv", "w")

headers = "State, City, Company, Address\n"
f.write(headers)

for state in states:
    stateurl = baseurl + "" + state['href']
    sClient = uReq(stateurl)
    statehtml = sClient.read()
    sClient.close()
    state_soup = soup(statehtml, "html.parser")
    cities = state_soup.find("table").findAll("a")
    for city in cities:
        cityurl = baseurl + "" + city['href']
        cClient = uReq(cityurl)
        cityhtml = cClient.read()
        cClient.close()
        city_soup = soup(cityhtml, "html.parser")
        companies = city_soup.find("table").findAll("a")
        for company in companies:
            companyurl = baseurl + "" + company['href']
            comClient = uReq(companyurl)
            companyhtml = comClient.read()
            comClient.close()
            company_soup = soup(companyhtml, "html.parser")
            address = company_soup.find("table")
            if hasattr(address, 'text'):
                print("" + state.text + " - " + city.text + " - " + company.text + "")
                f.write(state.text + "," + city.text + "," + company.text.replace(",", " ") + "," + address.text.replace(",", " ") + "\n")
            else:
                print("")
f.close()
print("^^^^^^All information extracted^^^^^^^^End of Program^^^^^^^^^")