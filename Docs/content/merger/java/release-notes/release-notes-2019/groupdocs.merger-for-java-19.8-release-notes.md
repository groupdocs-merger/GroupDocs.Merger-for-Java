---
id: groupdocs-merger-for-java-19-8-release-notes
url: merger/java/groupdocs-merger-for-java-19-8-release-notes
title: GroupDocs.Merger for Java 19.8 Release Notes
weight: 2
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 19.8{{< /alert >}}

## Major Features

There are a few new features in this regular monthly release. The most notable are:

*   Implemented .png and .bmp image joining
*   Expanded options for image joining with background color for empty black image space
*   Fixed Aspose.Note document type saving for multi-threading
*   Implemented a new method GetDocumentInfo
*   Implemented a new format .html
*   Implemented .tiff image joining

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-543 | Implement .png and .bmp image joining | New Feature |
| MERGERNET-561 | Expand options for image joining with background color for empty black image space | New Feature |
| MERGERNET-431 | Implement a new method GetDocumentInfo | New Feature |
| MERGERNET-513 | Implement a new format .html | New Feature |
| MERGERNET-544 | Implement .tiff image joining | New Feature |
| MERGERNET-373 | Fix Aspose.Note document type saving for multi-threading | Bug |

## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 19.8. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

1.  Images Join Example  
    Following example demonstrates how to join images:
    
    ```java
    // Variables.
    string sourcePath = "C:\testfiles\";
    long[] sourceFormatArray = {FileFormat.Bmp, FileFormat.Png, FileFormat.Tiff};
    int[] rowNumberForElement = {1,2,2};
    int[] columnNumberForElement = { 22, 23, 23 };
    InputStream[] inputStreams = {new FileInputStream(sourcePath + test.bmp),new FileInputStream(sourcePath + test.png),new FileInputStream(sourcePath + test.tiff)}
    int order = Order.JoinByRowsFirst
     
    // Preparing.
    java.util.List<ImageJoinItem> imageItems = new ArrayList<ImageJoinItem>();
     
    int i = 0;
    for (Long sourceFileFormat : sourceFormatArray)
    {           
        String title = String.format("%s:%s:%s-%s||", order, sourceFileFormat,rowNumberForElement[i],columnNumberForElement[i]);
        InputStream imageStream = inputStreams[i];
        ImageJoinItem imageJoinItem = new ImageJoinItem(imageStream, sourceFileFormat, rowNumberForElement[i], columnNumberForElement[i], 2);
        imageJoinItem.setIdentifyRow(title);
        imageItems.add(imageJoinItem);
        i++;
    }
    ImageJoinOptions options = new ImageJoinOptions(outputFileFormat, order);
     
    // Main method.
    DocumentInfo resultInfo = new DocumentHandler().getDocumentInfo(documentExample);
    ```
    
2.  New method GetDocumentInfo  
    The **DocumentHandler** class was extended with a new **GetDocumentInfo** method.
    
    **GetDocumentInfo method**
    
    ```java
    /**
     * <p>
     * Get information about document.
     * </p>
     * @return 
     * @param stream 
    */ 
    public final DocumentInfo getDocumentInfo(java.io.InputStream stream) throws java.lang.Exception
     
    /**
     * <p>
     * Get information about document.
     * </p>
     * @return 
     * @param documentStream
     * @param password 
     */  
    public final DocumentInfo getDocumentInfo(java.io.InputStream documentStream, String password) throws java.lang.Exception
     
    /**
     * <p>
     * Get information about document.
     * </p>
     * @return 
     * @param stream 
     * @param opt 
     */  
    public final DocumentInfo getDocumentInfo(java.io.InputStream stream, Options opt) throws java.lang.Exception
    ```
    
     Following example demonstrates how to use a new **GetDocumentInfo** method:
    
    
    
    ```java
    // Variables.
    string sourceFile = "C:\testfiles\filename";
     
    // Preparing.
    InputStream documentExample = new FileInputStream(sourceFile);
     
    // Main method.
    DocumentInfo resultInfo = new DocumentHandler().getDocumentInfo(documentExample);
    ```
