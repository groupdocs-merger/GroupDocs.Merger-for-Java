---
id: generate-document-pages-preview
url: merger/java/generate-document-pages-preview
title: Generate document pages preview
weight: 6
description: "Following this guide you will learn how to generate PDF, Word, Excel, PowerPoint documents thumbnails and preview document pages using GroupDocs.Merger for Java API."
keywords: Preview document pages, Document pages as PNG, document pages as JPG, Document preview
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) provides [PreviewOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/PreviewOptions) class to specify different options to manage preview of document pages.  
  
Here are the steps to generate document preview with GroupDocs.Merger:
*   Create new instance of [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) class and pass source document path as a constructor parameter.    
*   Instantiate the [PreviewOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/PreviewOptions) object with:    
    *   delegate for each page output stream creation (see event handler [CreatePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/CreatePageStream));         
    *   image preview format - PNG / JPG / BMP;        
    *   page numbers to process;        
    *   custom size of preview images (if needed).           
{{< alert style="info" >}}
OutputStream that were created by [CreatePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/CreatePageStream) delegate will be disposed automatically once after generation of preview image. If you need to implement custom image preview stream disposing you have to pass additional argument [ReleasePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/ReleasePageStream) to clean up resources.
{{< /alert >}}
*   Call [generatePreview](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#generatePreview(com.groupdocs.merger.domain.options.interfaces.IPreviewOptions)) method of [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) class instance and pass [PreviewOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/PreviewOptions) to it.
    

## CreatePageStream delegate implementation

GroupDocs.Merger expects [CreatePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/CreatePageStream) delegate to obtain each page stream for image preview generation process

```java
private static OutputStream createPageStream(int pageNumber)
{
    try{
        String imageFilePath = new File("GeneratePreviewFolder", "image-" + pageNumber + ".jpg").getPath();
        return new FileOutputStream(imageFilePath);
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }
}
```

## ReleasePageStream delegate implementation

```java
private static void releasePageStream(int pageNumber, OutputStream pageStream) 
{
    try {
        pageStream.close();
        String imageFilePath = new File("GeneratePreviewFolder", "image-" + pageNumber + ".jpg").getPath();
        System.out.print("Image file "+imageFilePath+" is ready for preview.");
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }
}
```

## Generate document preview from file on local disk

```java
public static void getPreview()
{   
 	string filePath = "c:\sample.xlsx";
    Merger merger = new Merger(filePath);

	IPreviewOptions previewOption = new PreviewOptions(new CreatePageStream() {
    	@Override
    	public OutputStream invoke(int pageNumber) {
        	return createPageStream(pageNumber);
    	}
	}, PreviewMode.JPEG);
	merger.generatePreview(previewOption);
}
 
private static OutputStream createPageStream(int pageNumber)
{
    try{
        String imageFilePath = new File("GeneratePreviewFolder", "image-" + pageNumber + ".jpg").getPath();
        return new FileOutputStream(imageFilePath);
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }

}
```

## Generate document preview from stream with custom stream releasing delegate

```java
public static void getPreview()
{
    string filePath = "c:\sample.xlsx";
	Merger merger = new Merger(filePath);

	IPreviewOptions previewOption = new PreviewOptions(new CreatePageStream() {
 	   @Override
	    public OutputStream invoke(int pageNumber) {
 	       return createPageStream(pageNumber);
 	   }
	}, new ReleasePageStream() {
	    @Override
  	  public void invoke(int pageNumber, OutputStream pageStream) {
  	      releasePageStream(pageNumber, pageStream);
  	  }
	}, PreviewMode.JPEG);
	merger.generatePreview(previewOption);
}
 

private static OutputStream createPageStream(int pageNumber)
{
    try{
        String imageFilePath = new File("GeneratePreviewFolder", "image-" + pageNumber + ".jpg").getPath();
        return new FileOutputStream(imageFilePath);
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }

}

private static void releasePageStream(int pageNumber, OutputStream pageStream)
{
    try {
        pageStream.close();
        String imageFilePath = new File("GeneratePreviewFolder", "image-" + pageNumber + ".jpg").getPath();
        System.out.print("Image file "+imageFilePath+" is ready for preview.");
    }catch (Exception e){
        throw new GroupDocsException(e.getMessage());
    }
}
private static String getImagePath(int pageNumber)
{
    return Constants.OutputPath +"GeneratePreview\\image-"+pageNumber+".jpg";
}
```

{{< alert style="info" >}}
NOTE: Stream that was created over [CreatePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/CreatePageStream) delegate will be disposed automatically once after generation of preview image. If you need to implement custom image preview stream disposing you have to pass additional argument [ReleasePageStream](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.common/ReleasePageStream)to clean up resources.
{{< /alert >}}

## More resources
### Advanced Usage Topics 
To learn more about document merging features, please refer the [advanced usage section]({{< ref "merger/java/developer-guide/advanced-usage/_index.md" >}}).

### GitHub Examples 
You may easily run the code above and see the feature in action in our GitHub examples:
*   [GroupDocs.Merger for .NET examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-.NET)    
*   [GroupDocs.Merger for Java examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java)

### Free Online App 
Along with full featured Java library we provide simple, but powerful free Apps.
You are welcome to merge your documents with our free online **[GroupDocs Merger App](https://products.groupdocs.app/merger)**.
