---
id: add-document-to-presentation-via-ole
url: merger/java/add-document-to-presentation-via-ole
title: Add document to Presentation via OLE
weight: 3
description: "This article explains how to add document to Presentation via OLE with GroupDocs.Merger within your Java applications."
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
## What is OLE object for Presentation?

The "Object Linking and Embedding" technology helps to embed some other document in the currently editing Presentation one. For this case, the frame object is using for the embedded document content. The Word and PDF documents, Excel and Oped Document format spreadsheets and other document types can be embedded in a PowerPoint presentation as frame that is predefined with X and Y coordinates and it's size.

## Add document to Presentation via OLE

**[GroupDocs.Merger](https://products.groupdocs.com/merger/java)** provides an ability to add other single document as embedded document to Presentation.   
Here are the steps for it:

*   Initialise [OlePresentationOptions](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/OlePresentationOptions) class with embedded file path and page number;
*   Instantiate [Merger](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger) object with source document path or stream;
*   Call [importDocument](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#importDocument(com.groupdocs.merger.domain.options.interfaces.IImportDocumentOptions)) method and pass [OlePresentationOptions](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger.domain.options/OlePresentationOptions) object to it;
*   Call [save](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#save(java.lang.String)) method and pass desired file path to save resultant document.

The following code sample demonstrates how to add other single document as embedded document to Presentation:

```java

int pageNumber = 2;
OlePresentationOptions oleSlidesOptions = new OlePresentationOptions("c:\embedded.pdf", pageNumber);
oleSlidesOptions.setX(10);
oleSlidesOptions.setY(10);
 
Merger merger = new Merger("c:\sample.ppt");
{
    merger.importDocument(oleSlidesOptions);
    merger.save("c:\output\result.ppt");
}

```

## More resources
### Advanced Usage Topics 
To learn more about document merging features, please refer the [advanced usage section]({{< ref "merger/java/developer-guide/advanced-usage/_index.md" >}}).

### GitHub Examples 
You may easily run the code above and see the feature in action in our GitHub examples:
*   [GroupDocs.Merger for .NET examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-.NET)    
*   [GroupDocs.Merger for Java examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java)    

### Free Online App

Along with full featured .NET library we provide simple, but powerful free Apps.  
You are welcome to merge your documents with our free online **[GroupDocs Merger App](https://products.groupdocs.app/merger)**.
