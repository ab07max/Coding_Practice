import bs4
from urllib.request import urlopen as uReq
from bs4 import BeautifulSoup as soup

baseurl = "http://mortgage.dzot.com/"
myurl = "http://mortgage.dzot.com/city-ny-newyork.html"

uClient = uReq(myurl)
myhtml = uClient.read()
uClient.close()

page_soup = soup(myhtml, "html.parser")
c = page_soup.find("table").findAll("a")

for cs in c:
    companyurl = baseurl + "" + cs['href']
    comClient = uReq(companyurl)
    companyhtml = comClient.read()
    comClient.close()
    company_soup = soup(companyhtml, "html.parser")
    address = company_soup.find("table")
    if hasattr(address, 'text'):
        print(address.text)
    else:
        print(cs.text + "This doesn't have any text")

print("^^^^^^All information extracted^^^^^^^^End of Program^^^^^^^^^")