package com.groupdocs.merger.examples;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.groupdocs.merger.domain.JoinItem;
import com.groupdocs.merger.domain.format.FileFormat;
import com.groupdocs.merger.domain.image.PageImage;
import com.groupdocs.merger.domain.options.ImageOptions;
import com.groupdocs.merger.domain.options.JoinOptions;
import com.groupdocs.merger.domain.options.MoveOptions;
import com.groupdocs.merger.domain.options.OrientationMode;
import com.groupdocs.merger.domain.options.OrientationOptions;
import com.groupdocs.merger.domain.options.PageSplitOptions;
import com.groupdocs.merger.domain.options.RangeMode;
import com.groupdocs.merger.domain.options.RemovePagesOptions;
import com.groupdocs.merger.domain.options.RotateMode;
import com.groupdocs.merger.domain.options.RotateOptions;
import com.groupdocs.merger.domain.options.SwapOptions;
import com.groupdocs.merger.domain.options.TrimOptions;
import com.groupdocs.merger.domain.result.DocumentResult;
import com.groupdocs.merger.domain.result.MultiDocumentResult;
import com.groupdocs.merger.domain.security.AddPasswordOptions;
import com.groupdocs.merger.domain.security.RemovePasswordOptions;
import com.groupdocs.merger.domain.security.UpdatePasswordOptions;
import com.groupdocs.merger.handler.DocumentHandler;

public class DocsManipulation {
 
	/*
	 * Change page order for password-protected document of known format (fastest version)
	 */
	public static void changePageOrderOfProtectedKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:changePageOrderOfProtectedKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		int pageNumber = 4;
		int newPageNumber = 2;

		MoveOptions pagesOptions = new MoveOptions(FileFormat.Docx, password, pageNumber, newPageNumber);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().movePage(documentExample, pagesOptions);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:changePageOrderOfProtectedKnownFormatDoc
	}

	/*
	 * Change page order for document of unknown format
	 */
	public static void changePageOrderUnKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:changePageOrderUnKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		int pageNumber = 6;
		int newPageNumber = 1;
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().movePage(documentExample, pageNumber, newPageNumber);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:changePageOrderUnKnownFormatDoc
	}

	/*
	 * Remove list of pages from password-protected document of known format
	 */
	public static void removePagesFromProtectedKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:removePagesFromProtectedKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		List<Integer> pages = new ArrayList<Integer>();
		pages.add(2);
		RemovePagesOptions pagesOptions = new RemovePagesOptions(FileFormat.Xlsx, password, pages);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().removePages(documentExample, pagesOptions);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removePagesFromProtectedKnownFormatDoc
	}

	/*
	 * Remove list of pages from document of unknown format
	 */
	public static void removePagesFromUnknownFormatDoc(String fileName) throws Throwable {
		//ExStart:removePagesFromUnknownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		List<Integer> pages = new ArrayList<Integer>();
		pages.add(2);
		InputStream documentExample = new FileInputStream(sourceFile);
		// Main method.
		DocumentResult result = new DocumentHandler().removePages(documentExample, pages);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removePagesFromUnknownFormatDoc
	}

	/*
	 * Remove range of pages from password-protected document of known format
	 */
	public static void removePagesRangeFromProtectedKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:removePagesRangeFromProtectedKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		int startPage = 2;
		int endPage = 4;
		int mode = RangeMode.AllPages;
		RemovePagesOptions removeOptions = new RemovePagesOptions(FileFormat.Docx,password,startPage, endPage, mode);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().removePages(documentExample, removeOptions);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removePagesRangeFromProtectedKnownFormatDoc
	}

	/*
	 * Remove range of pages from document of unknown format
	 */
	public static void removePagesRangeFromUnknownFormatDoc(String fileName) throws Throwable {
		//ExStart:removePagesRangeFromUnknownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		int startPage = 1;
		int endPage = 5;
		int mode = RangeMode.AllPages;
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().removePages(documentExample, startPage, endPage, mode);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removePagesRangeFromUnknownFormatDoc
	}
	
	/*
	 * Splitting by page numbers to several one page documents 
	 */
	public static void SplittingToOnePageDocuments(String fileName) throws Throwable {
		//ExStart:SplittingToOnePageDocuments
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		
		int[] pages = {3,4};
		PageSplitOptions pagesSplitOptions = new PageSplitOptions(FileFormat.Pdf, password, pages);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		MultiDocumentResult splitResult = new DocumentHandler().split(documentExample, pagesSplitOptions);
		for (int i = 0; i < splitResult.getDocuments().size(); i++) {
			// First document
			OutputStream documentStream = splitResult.getDocuments().get(i).getStream();
			ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
			byte[] bytes = byteArrayStream.toByteArray();
			FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + i + "." + fileName);
			fos.write(bytes, 0, bytes.length);
			fos.close();
		}
		//ExEnd:SplittingToOnePageDocuments
	}

	/*
	 * Splitting  by page ranges to several documents
	 */
	public static void splittingByPageRanges(String fileName) throws Throwable {
		//ExStart:splittingByPageRanges
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		int startPage = 5;
		int endPage = 8;
		int mode = RangeMode.EvenPages;
		PageSplitOptions splitOptions = new PageSplitOptions(FileFormat.Pdf,password,startPage, endPage, mode);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		MultiDocumentResult splitResult = new DocumentHandler().split(documentExample, splitOptions);
		for (int i = 0; i < splitResult.getDocuments().size(); i++) {
			OutputStream documentStream = splitResult.getDocuments().get(i).getStream();
			ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
			byte[] bytes = byteArrayStream.toByteArray();
			FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + i + "." + fileName);
			fos.write(bytes, 0, bytes.length);
			fos.close();
		}
		//ExEnd:splittingByPageRanges
	}

	/*
	 * Swap by page numbers for password-protected document of known format
	 */
	public static void swapProtectedDocumentOfKnownFormat(String fileName) throws Throwable {
		//ExStart:swapProtectedDocumentOfKnownFormat
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		int pageNumber1 = 3;
		int pageNumber2 = 6;
		SwapOptions pagesOptions = new SwapOptions(pageNumber2, pageNumber1, FileFormat.Pdf, password);
		InputStream documentExample = new FileInputStream(sourceFile);
		// Main method.
		DocumentResult result = new DocumentHandler().swapPages(documentExample, pagesOptions);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:swapProtectedDocumentOfKnownFormat
	}

	/*
	 * Swap by page numbers for document of unknown format
	 */
	public static void swapDocumentOfUnknownFormat(String fileName) throws Throwable {
		//ExStart:swapDocumentOfUnknownFormat
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		int pageNumber1 = 3;
		int pageNumber2 = 6;
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().swapPages(documentExample, pageNumber1, pageNumber2);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:swapDocumentOfUnknownFormat
	}

	/*
	 * Trim document of known format by page numbers list 
	 */
	public static void trimDocumentByPageNumList(String fileName) throws Throwable {
		//ExStart:trimDocumentByPageNumList
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparation.
		String password = "SomePasswordString";
		int pageNumber1 = 3;
		int pageNumber2 = 6;
		List<Integer> pages = new ArrayList<Integer>();
		pages.add(pageNumber1);
		pages.add(pageNumber2);
		TrimOptions trimOptions = new TrimOptions(FileFormat.Pdf, password, pages);
		InputStream documentExample = new FileInputStream(sourceFile);
		// Main method.
		DocumentResult result = new DocumentHandler().trim(documentExample, trimOptions);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:trimDocumentByPageNumList
	}

	/*
	 * Trim document of known format by page numbers range
	 */
	public static void trimDocumentByPageNumRange(String fileName) throws Throwable {
		//ExStart:trimDocumentByPageNumRange
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparation.
		String password = "setpassword123";
		int startPage = 1;
		int endPage = 5;
		int mode = RangeMode.AllPages;
		TrimOptions trimOptions = new TrimOptions(FileFormat.Pdf,password,startPage, endPage, mode);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().trim(documentExample, trimOptions);
		OutputStream documentStream = result.getStream();

		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:trimDocumentByPageNumRange
	}

	/*
	 * Join list of password-protected document of known format
	 */
	public static void joinDocumentsOfKnownFormat(String fileName, String fileName2) throws Throwable {
		//ExStart:joinDocumentsOfKnownFormat
		String sourceFile = CommonUtilities.sourcePath + fileName;
		String sourceFile2 = CommonUtilities.sourcePath + fileName2;
		// Preparing.
		String password = "SomePasswordString";
		InputStream documentExample1 = new FileInputStream(sourceFile);
		InputStream documentExample2 = new FileInputStream(sourceFile2);
		
		List<JoinItem> documentStreams = new ArrayList<JoinItem>();
		JoinItem item1 = new JoinItem(documentExample1, FileFormat.Pdf, password);
		documentStreams.add(item1);
		JoinItem item2 = new JoinItem(documentExample2, FileFormat.Pdf, password);
		documentStreams.add(item2);

		// Main method.
		DocumentResult result = new DocumentHandler().join(documentStreams);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		
		//ExEnd:joinDocumentsOfKnownFormat
	}

	/*
	 * Join list of document of unknown format
	 */
	public static void joinDocumentsOfUnknownFormat(String fileName, String fileName2) throws Throwable {
		//ExStart:joinDocumentsOfUnknownFormat
		String sourceFile = CommonUtilities.sourcePath + fileName;
		String sourceFile2 = CommonUtilities.sourcePath + fileName2;
		// Preparing.
		InputStream documentExample1 = new FileInputStream(sourceFile);
		InputStream documentExample2 = new FileInputStream(sourceFile2);
		List<InputStream> documentStreams = new ArrayList<InputStream>();
		documentStreams.add(documentExample1);
		documentStreams.add(documentExample2);

		// Main method.
		DocumentResult result = new DocumentHandler().joinStream(documentStreams);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:joinDocumentsOfUnknownFormat
	}

	/*
	 * Check security of document of known format
	 */
	public static void checkProtectionOfKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:checkProtectionOfKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		InputStream documentExample = new FileInputStream(sourceFile);

		// Check document of known format
		boolean resultProtected = new DocumentHandler().isPasswordSet(documentExample, FileFormat.Docx);
		System.out.println("Document is protected: " + resultProtected);
		//ExEnd:checkProtectionOfKnownFormatDoc
	}

	/*
	 * Check security of document of unknown format
	 */
	public static void checkProtectionOfUnknownFormatDoc(String fileName) throws Throwable {
		//ExStart:checkProtectionOfUnknownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		InputStream documentExample = new FileInputStream(sourceFile);
		// Check document of known format
		boolean resultProtected = new DocumentHandler().isPasswordSet(documentExample);
		System.out.println("Document is protected: " + resultProtected);
		//ExEnd:checkProtectionOfUnknownFormatDoc
	}

	/*
	 * Remove password protection for document of known format
	 */
	public static void removeProtectionOfKnownFormatDoc(String fileName) throws Throwable {
		//ExStart:removeProtectionOfKnownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		RemovePasswordOptions options = new RemovePasswordOptions(FileFormat.Docx, password);
		InputStream documentExample = new FileInputStream(sourceFile);
		// Main method.
		DocumentResult result = new DocumentHandler().removePassword(documentExample, options);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removeProtectionOfKnownFormatDoc
	}

	/*
	 * Remove password protection for document of un-known format
	 */
	public static void removeProtectionOfUnknownFormatDoc(String fileName) throws Throwable {
		//ExStart:removeProtectionOfUnknownFormatDoc
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().removePassword(documentExample, password);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:removeProtectionOfUnknownFormatDoc
	}

	/*
	 * Set password protection for document of known format
	 */
	public static void setProtectionForKnownFormatDocs(String fileName) throws Throwable {
		//ExStart:setProtectionForKnownFormatDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		AddPasswordOptions options = new AddPasswordOptions(FileFormat.Docx, password);
		InputStream documentExample = new FileInputStream(sourceFile);

		// Main method.
		DocumentResult result = new DocumentHandler().addPassword(documentExample, options);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:setProtectionForKnownFormatDocs
	}
	
	/*
	 * Set password protection for document of un-known format
	 */
	public static void setProtectionForUnknownFormatDocs(String fileName) throws Throwable{
		//ExStart:setProtectionForUnknownFormatDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		InputStream documentExample = new FileInputStream(sourceFile);
		 
		// Main method.
		DocumentResult result = new DocumentHandler().addPassword(documentExample, password);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:setProtectionForUnknownFormatDocs
	}
	
	/*
	 * Update password for document of known format
	 */
	public static void updateProtectionForKnownForamtDocs(String fileName) throws Throwable{
		//ExStart:updateProtectionForKnownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String currentPassword = "SomePasswordString";
		String newPassword = "NewPasswordString";
		UpdatePasswordOptions options = new UpdatePasswordOptions(FileFormat.Docx, currentPassword, newPassword);
		InputStream documentExample = new FileInputStream(sourceFile);
		 
		// Main method.
		DocumentResult result = new DocumentHandler().updatePassword(documentExample, options);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:updateProtectionForKnownForamtDocs
	}
	
	/*
	 * Update password for document of un-known format
	 */
	public static void updateProtectionForUnknownForamtDocs(String fileName) throws Throwable{
		//ExStart:updateProtectionForUnknownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String currentPassword = "SomePasswordString";
		String newPassword = "NewPasswordString";
		InputStream documentExample = new FileInputStream(sourceFile);
		 
		// Main method.
		DocumentResult result = new DocumentHandler().updatePassword(documentExample, currentPassword, newPassword);
		OutputStream documentStream = result.getStream();
		ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
		fos.write(bytes, 0, bytes.length);
		fos.close();
		//ExEnd:updateProtectionForUnknownForamtDocs
	}
	
	/*
	 * Set Page Orientation For Password-Protected Document Of Known Format
	 */
	public static void setPageOrientationForPasswordProtectedKnownForamtDocs(String fileName) throws Throwable{
		//ExStart:setPageOrientationForPasswordProtectedKnownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		OrientationOptions pagesOptions = new OrientationOptions(OrientationMode.Landscape, FileFormat.Docx, password, new int[]{1,2});
		InputStream documentExample = new FileInputStream(sourceFile); 
		// Main method.
		DocumentResult result = new DocumentHandler().changeOrientation(documentExample, pagesOptions);
		OutputStream documentStream = result.getStream();
		CommonUtilities.saveDocument((ByteArrayOutputStream)documentStream, fileName);
		System.out.println(result.getFileFormat());
		//ExEnd:setPageOrientationForPasswordProtectedKnownForamtDocs
	}
	
	/*
	 * Set Page Orientation For Document Of Unknown Format
	 */
	public static void setPageOrientationForUnknownForamtDocs(String fileName) throws Throwable{
		//ExStart:setPageOrientationForUnknownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		InputStream documentExample = new FileInputStream(sourceFile);		  
		// Main method.
		DocumentResult result = new DocumentHandler().changeOrientation(documentExample, OrientationMode.Landscape, new int[]{1,6});
		OutputStream documentStream = result.getStream();
		CommonUtilities.saveDocument((ByteArrayOutputStream)documentStream, fileName);
		System.out.println(result.getFileFormat());
		//ExEnd:setPageOrientationForUnknownForamtDocs
	}
	
	/*
	 * Rotate pages on password-protected document of known format
	 */
	public static void rotatePagesOnPasswordProtectedKnownForamtDocs(String fileName) throws Throwable{
		//ExStart:rotatePagesOnPasswordProtectedKnownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "SomePasswordString";
		List<Integer> pageNumbersForRotation = new ArrayList<Integer>();
		pageNumbersForRotation.add(3);
		pageNumbersForRotation.add(6);  
		RotateOptions pagesOptions = new RotateOptions(FileFormat.Docx, password, RotateMode.Rotate180, pageNumbersForRotation );
		InputStream documentExample = new FileInputStream(sourceFile);
		// Main method.
		DocumentResult result = new DocumentHandler().rotatePages(documentExample, pagesOptions);
		OutputStream documentStream = result.getStream();
		CommonUtilities.saveDocument((ByteArrayOutputStream)documentStream, fileName);
		System.out.print(result.getFileFormat()); 
		//ExEnd:rotatePagesOnPasswordProtectedKnownForamtDocs
	}
	
	/*
	 * Rotate pages on document of Unknown format
	 */
	public static void rotatePagesOnUnknownForamtDocs(String fileName) throws Throwable{
		//ExStart:rotatePagesOnUnknownForamtDocs
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		InputStream documentExample = new FileInputStream(sourceFile);
		  
		// Main method.
		DocumentResult result = new DocumentHandler().rotatePages(documentExample, RotateMode.Rotate270);
		OutputStream documentStream = result.getStream();		
		CommonUtilities.saveDocument((ByteArrayOutputStream)documentStream, fileName);
		System.out.print(result.getFileFormat());
		//ExEnd:rotatePagesOnUnknownForamtDocs
	}
	
	/*
	 * Get Supported Formats
	 */
	public static void getSupportedFormats() throws Throwable{
		//ExStart:getSupportedFormats
		Map<String, Long> documentFormatsContainer = new DocumentHandler().getSupportedFormats();
		for (Map.Entry<String, Long>entry : documentFormatsContainer .entrySet()) {   
			System.out.println("Key:"+entry.getKey()+", value:"+entry.getValue());		      
		}
		//ExEnd:getSupportedFormats
	}
	
	/*
	 * Get Image Representation of Document
	 */
	public static void getImageRepresentationOfDocument(String fileName) throws Throwable{
		//ExStart:getImageRepresentationOfDocument
		String sourceFile = CommonUtilities.sourcePath + fileName;
		// Preparing.
		String password = "";
		List<Integer> pageNumbers = new ArrayList<Integer>();
		pageNumbers.add(6);
		pageNumbers.add(4);  
		ImageOptions pagesOptions = new ImageOptions(pageNumbers, FileFormat.Xlsx, password);
		InputStream documentExample = new FileInputStream(sourceFile);
		
		// Main method.        
		List<PageImage> images = new DocumentHandler().getPagePreview(documentExample, pagesOptions);
		PageImage page = images.get(1);
		System.out.print(page.getPageNumber());
		//ExEnd:getImageRepresentationOfDocument
	}
}
