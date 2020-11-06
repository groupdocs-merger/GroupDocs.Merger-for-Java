---
id: groupdocs-merger-for-java-20-4-release-notes
url: merger/java/groupdocs-merger-for-java-20-4-release-notes
title: GroupDocs.Merger for Java 20.4 Release Notes
weight: 30
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 20.4{{< /alert >}}

## Major Features

There are a few new other features in this regular monthly release. The most notable are:

*   Removed legacy API;
*   Added XLAM file format support;
*   Implemented MHTML format support;
*   Fixed loading of the password-protected Odp and Otp formats;
*   The Note format .One was  fixed for .Net Standard;
*   Fixed Total license loading for .Net standart product.

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-417 | Add XLAM document format support | Feature |
| MERGERNET-767 | Implement MHTML format support | Feature |
| MERGERNET-557 | Protected Odp and Otp is not supported | Bug |
| MERGERNET-707 | The Note format .One is not supported for .Net Standard and Core | Bug |
| MERGERNET-733 | Compatibility issues under .NET Standard 2.0 | Bug |

## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 20.4. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

### Refactoring options and enumerations related to Split operation

1. Renamed options and enumerations related to Split operation:  
1.1 Renamed class **PageSplitOptions** to **SplitOptions;**  
1.2 Removed interface **IPageSplitOptions** and used **ISplitOptions** instead;  
1.3 Renamed enumeration **PageSplitMode** to **SplitMode**.

2\. Moved **PageSplitOptions** (SplitOptions after renaming) constructor optional parameters to the end of parameters list:  
2.1 Changed parameters order *PageSplitOptions(string filePathFormat, int splitMode int\[\] pageNumbers)*  
to *SplitOptions(string filePathFormat, int\[\] pageNumbers, int splitMode  
2.2 Changed parameters order *PageSplitOptions(CreateSplitStream createSplitStream, int splitMode int\[\] pageNumbers)*  
to *SplitOptions(CreateSplitStream createSplitStream, int\[\] pageNumbers, int splitMode);*  
2.3 Changed parameters order *PageSplitOptions(CreateSplitStream createSplitStream, ReleaseSplitStream releaseSplitStream, int splitMode, int\[\] pageNumbers)*  
to *SplitOptions(CreateSplitStream createSplitStream, ReleaseSplitStream releaseSplitStream, int\[\] pageNumbers, int splitMode).*

### New XLAM and MHTML file types were added

A new **.XLAM** and new **.MHTML** file types were added to GroupDocs.Merger for Java product and accordingly to the following Wiki Public Docs page: [Supported Document Types]({{< ref "merger/java/getting-started/supported-document-formats.md" >}}).

### All the Legacy namespaces with classes are removed:
1.  com.groupdocs.merger.legacy.handler    
2.  com.groupdocs.merger.legacy.domain    
3.  com.groupdocs.merger.legacy.domain.format    
4.  com.groupdocs.merger.legacy.domain.image    
5.  com.groupdocs.merger.legacy.domain.options    
6.  com.groupdocs.merger.legacy.domain.result    
7.  com.groupdocs.merger.legacy.domain.security    

### Added interface PageStreamFactory instead ReleasePageStream delegate.

**PageStreamFactory example**

```java
 Merger merger = new Merger("C:\\test.docx");

    IPreviewOptions previewOption = new PreviewOptions(new PageStreamFactory() {
        @Override
        public OutputStream createPageStream(int pageNumber) {
            return createStream(pageNumber);
        }

        @Override
        public void closePageStream(int pageNumber, OutputStream pageStream) {
            releasePageStream(pageNumber, pageStream);
        }
    }, PreviewMode.JPEG);
    merger.generatePreview(previewOption);


private static String getImagePath(int pageNumber)
{
    return "C:\\output\\image-"+pageNumber+".jpg";
}

private static OutputStream createStream(int pageNumber)
{
    try{
        String imageFilePath = getImagePath(pageNumber);
        return new FileOutputStream(imageFilePath);
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }

}

private static void releasePageStream(int pageNumber, OutputStream pageStream)
{
    try {
        pageStream.close();
        String imageFilePath = getImagePath(pageNumber);
        System.out.print("Image file "+imageFilePath+" is ready for preview.");
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }
}
```

### Added interface SplitStreamFactory instead ReleaseSplitStream delegate.

**SplitStreamFactory example**

```java
final List<OutputStream> resultStreams = new ArrayList<OutputStream>();
SplitOptions splitOptions = new SplitOptions(new SplitStreamFactory() {
    @Override
    public OutputStream createSplitStream(int pageNumber) {
        return new ByteArrayOutputStream();
    }

    @Override
    public void closeSplitStream(int pageNumber, OutputStream pageStream) {
        resultStreams.add(pageStream);
    }
},  new int[] { 3, 4}, SplitMode.Pages);
Merger merger = new Merger("C:\\test.docx");
merger.split(splitOptions);
```
