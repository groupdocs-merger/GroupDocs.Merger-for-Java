---
id: groupdocs-merger-for-java-18-12-release-notes
url: merger/java/groupdocs-merger-for-java-18-12-release-notes
title: GroupDocs.Merger for Java 18.12 Release Notes
weight: 1
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 18.12{{< /alert >}}

## Major Features

There are 18 new features in this regular monthly release. The most notable are:

*   Added Diagram file formats support support (VSDX, VSDM, VSSX, VSSM, VTX, VSTM, VDX, VSTX, VSX)
*   Added Note file formats support (One)
*   Extended Security methods with ODT/OTT formats support
*   Added Rotate method to rotate pages in document 
*   Added ChangeOrientation method to change orientation of pages in document
*   Added functionality to get all supported formats

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-259 | Diagram formats support for Join method | New Feature |
| MERGERNET-260 | Diagram formats support for MovePage method | New Feature |
| MERGERNET-261 | Diagram formats support for RemovePage method | New Feature |
| MERGERNET-262 | Diagram formats support for Split document method | New Feature |
| MERGERNET-264 | Diagram formats support for SwapPages method | New Feature |
| MERGERNET-265 | Diagram formats support for Trim method | New Feature |
| MERGERNET-251 | Implement Security methods for ODT format | New Feature |
| MERGERNET-302 | Implement Security methods for OTT format | New Feature |
| MERGERNET-321 | Note formats support for Join method | New Feature |
| MERGERNET-322 | Note formats support for MovePage method | New Feature |
| MERGERNET-323 | Note formats support for RemovePage method | New Feature |
| MERGERNET-324 | Note formats support for Split document method | New Feature |
| MERGERNET-325 | Note formats support for SwapPages method | New Feature |
| MERGERNET-326 | Note formats support for Trim method | New Feature |
| MERGERNET-156 | Implement RotatePages method | New Feature |
| MERGERNET-245 | Implement ChangeOrientation method | New Feature |
| MERGERNET-259 | Implement GetSupportedFormats method | New Feature |

## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 18.12. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

### New method ChangeOrientation

New method ChangeOrientation has been added

```java
public DocumentResult ChangeOrientation(InputStream documentStream, OrientationOptions orientationOptions);
```

Operation **ChangeOrientation** let you change(set)  page orientation (portrait, landscape) for pages in document. In result you get a new stream that contains source document with original pages with specified orientation.

**Change (set) page orientation for password-protected document of known format (fastest version)**

```java
//string sourceFile = "C:\testfiles\filename";
 
// Preparing.
string password = "SomePasswordString";
OrientationOptions pagesOptions = new OrientationOptions(OrientationMode.Landscape, fileFormat, password, new int[]{1,2});
InputStream documentExample = new FileInputStream(sourceFile);
 
 
// Main method.
DocumentResult result = new DocumentHandler().changeOrientation(documentExample, pagesOptions);
OutputStream documentStream = result.getStream();
Console.WriteLine(result.getFileFormat());
```

**Change (set) page orientation for document of unknown format**

```java
//string sourceFile = "C:\testfiles\filename";
 
// Preparing.
InputStream documentExample = new FileInputStream(sourceFile);
 
// Main method.
DocumentResult result = new DocumentHandler().changeOrientation(documentExample, OrientationMode.Landscape, new int[]{1,6});
OutputStream documentStream = result.getStream();
Console.WriteLine(result.getFileFormat());
```

### New method GetSupportedFormats

New method GetSupportedFormats has been added

```java
public Map<String, Long> getSupportedFormats();
```

**Java**

```java
Map<String, Long> documentFormatsContainer = new DocumentHandler().getSupportedFormats();
for (Map.Entry<String, Long>entry : documentFormatsContainer .entrySet()) {   
       System.out.print("Key: entry.getKey(), format: entry.getValue()");    
}
```

### New method RotatePages

New method RotatePages has been added

```java
public DocumentResult RotatePages(Stream documentStream, RotateOptions rotateOptions);
```

Operation **RotatePages** let you rotate pages in document. In result you get a new stream that contents source document without rotated pages.

You can rotate pages by specifying rotate mode which is 90,180,270 degrees.

**Rotate pages on password-protected document of known format**

```java
string sourceFile = "C:\testfiles\filename";
 
// Preparing.
string password = "SomePasswordString";
List<Integer> pageNumbersForRotation = new List<Integer>();
pageNumbersForRotation.add(3);
pageNumbersForRotation.add(6);  
RotatePagesOptions pagesOptions = new RotatePagesOptions(fileFormat, password, RotateMode.Rotate180, pageNumbersForRotation );
InputStream documentExample = new FileInputStream(sourceFile);
 
// Main method.
DocumentResult result = new DocumentHandler().rotatePages(documentExample, pagesOptions);
OutputStream documentStream = result.getStream();
System.out.print(result.getFileFormat()); 
```

**Rotate pages on document of unknown format**

```java
string sourceFile = "C:\testfiles\filename";
 
// Preparing.
InputStream documentExample = new FileInputStream(sourceFile);
 
// Main method.
DocumentResult result = new DocumentHandler()rotatePages(documentExample, RotateMode.Rotate270);
 OutputStream documentStream = result.getStream();
System.out.print(result.getFileFormat());
```

### Obsolete class PagesOptions

Class PagesOptions is obsolete

```java
@Deprecated
public class PagesOptions;
```

Methods where that class was used are obsolete as well

```java
public DocumentResult removePages(InputStream documentStream, PagesOptions options);
public MultiDocumentResult split(InputStream documentStream, PagesOptions pagesOptions);
public DocumentResult trim(InputStream documentStream, PagesOptions pagesOptions);
```

New classes has been added

```java
public class RemovePagesOptions;
public class SplitOptions;
public class TrimOptions; 
```

Method signatures has been added

```java
public DocumentResult removePages(InputStream documentStream, RemovePagesOptions removePagesOptions);
public MultiDocumentResult split(InputStream documentStream, SplitOptions splitOptions);
public DocumentResult trim(InputStream documentStream, TrimOptions trimOptions);
```

Usage

You have to initiate one of new classes with list of page numbers and use it as option for appropriate method

```java
java.util.List<Integer> pages = new ArrayList<Integer>();
pages.add(1);
pages.add(3);
RemovePagesOptions pagesOptions = new RemovePagesOptions(fileFormat, password, pages);
 
DocumentResult streamResult = new DocumentHandler().removePages(documentExample, pagesOptions);
```

### Obsolete class RangeOptions

Class RangeOptions is obsolete

```java
@Deprecated
public class RangeOptions;
```

Methods where that class was used are obsolete also

```java
public DocumentResult removePages(InputStream documentStream, RangeOptions options);
public MultiDocumentResult split(InputStream documentStream, RangeOptions rangeOptions);
DocumentResult trim(InputStream documentStream, RangeOptions rangeOptions);
```

New classes has been added

```java
public class RemovePagesOptions;
public class SplitOptions;
public class TrimOptions; 
```

Method signatures has been added

```java
public DocumentResult removePages(InputStream documentStream, RemovePagesOptions removePagesOptions);
public MultiDocumentResult split(InputStream documentStream, SplitOptions splitOptions);
public DocumentResult trim(InputStream documentStream, TrimOptions trimOptions);
```

Usage

You have to initiate one of new classes with RangeMode enum and use it as option for appropriate method

```java
RemovePagesOptions removePagesOptions = new RemovePagesOptions(fileFormat, password, 1, 5, RangeMode.AllPages);
DocumentResult streamResult = new DocumentHandler().removePages(documentExample, removePagesOptions);
```
