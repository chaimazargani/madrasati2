package com.pfe.madrasati.configuration;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Repository;
import org.xmlpull.v1.XmlPullParserException;

import io.minio.MinioClient;
import io.minio.errors.ErrorResponseException;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InternalException;
import io.minio.errors.InvalidArgumentException;
import io.minio.errors.InvalidBucketNameException;
import io.minio.errors.InvalidEndpointException;
import io.minio.errors.InvalidPortException;
import io.minio.errors.NoResponseException;
import io.minio.errors.RegionConflictException;

@Repository
public class FileUploader {
	private MinioClient minioClient;
	final static private String ENDPOINT = System.getProperty("ENDPOINT");
	final static private String ACCESSKEY = System.getProperty("ACCESSKEY");
	final static private String SECRETKEY = System.getProperty("SECRETKEY");

	public void newMinioClient() {
		// Cr�er un minioClient avec le nom du serveur MinIO, le port, la cl� d'acc�s et
		// la cl� secr�te.
		try {
			this.minioClient = new MinioClient(ENDPOINT, ACCESSKEY, SECRETKEY);
		} catch (InvalidEndpointException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void makeBucket(String nomBucket) {
			try {
				minioClient.makeBucket(nomBucket);
			} catch (InvalidKeyException | InvalidBucketNameException | RegionConflictException
					| NoSuchAlgorithmException | InsufficientDataException | NoResponseException
					| ErrorResponseException | InternalException | IOException | XmlPullParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public void putObject(String nomBucket, String nomFichier, String pathRepertoire) {
		// T�l�charger le fichier zip dans le compartiment avec putObject
			try {
				minioClient.putObject(nomBucket, nomFichier, pathRepertoire);
			} catch (InvalidKeyException | InvalidBucketNameException | NoSuchAlgorithmException
					| InsufficientDataException | NoResponseException | ErrorResponseException | InternalException
					| InvalidArgumentException | IOException | XmlPullParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
