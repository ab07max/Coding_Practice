package com.image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;

public class imageDownload {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String existingBucketName = "demobuckets3.131217";
		String imgName = "mypic.png";
		
		BasicAWSCredentials awsCredentials = new BasicAWSCredentials("AKIAJMPRDKIZKBGXG6FQ", "pkWiyKMXjpJfjOYF27ihq6RPP6wd13QHTIf6NVas");
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withRegion(Regions.AP_SOUTH_1).withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
		long fileSize = s3Client.getObjectMetadata(existingBucketName, imgName).getContentLength();
		
		GetObjectRequest getObjectRequest = new GetObjectRequest(existingBucketName, imgName).withGeneralProgressListener(new ProgressListener() {
			double totalBytesRead = 0;
			DecimalFormat df = new DecimalFormat("#.##");
			@Override
			public void progressChanged(ProgressEvent progressEvent) {
				// TODO Auto-generated method stub
				totalBytesRead += progressEvent.getBytesTransferred();
				System.out.println(totalBytesRead + ">> Number of byte transfered " + new Date());
				
				double percentRead = (totalBytesRead/fileSize)*100;
				System.out.println("Percentage Downloaded = " + df.format(percentRead) + "%");
				
				if(progressEvent.getEventType() == ProgressEventType.TRANSFER_COMPLETED_EVENT)
					System.out.println("Completed!");
			}
			
		});
		
		System.out.println("Downloading...");
		
		s3Client.getObject(getObjectRequest,new File("E://Download//mypic.png"));
		
	}

}
