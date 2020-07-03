---
id: remove-pages
url: merger/java/remove-pages
title: Remove pages
weight: 2
description: "Follow this guide and learn how to remove page from PDF or Word document, delete worksheet from Excel file or remove slides from PowerPoint presentations with GroupDocs.Merger for Java API."
keywords: Remove page from document, Delete page from document, Remove page, Delete page
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) provides an ability to remove single page or a collection of specific page numbers from the source document.   
Here are the steps to remove document page(s):

*   Initialise [RemoveOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/RemoveOptions) class with page numbers to remove;
*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or stream;
*   Call [removePages](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#removePages(com.groupdocs.merger.domain.options.interfaces.IRemoveOptions)) method and pass [RemoveOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/RemoveOptions) object to it;
*   Call [save](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#save(java.lang.String)) method and pass desired file path to save resultant document.

The following code sample demonstrates how to remove document pages:

```java
String filePath = "c:\sample.one";
String filePathOut = "c:\output\result.one";

RRemoveOptions removeOptions = new RemoveOptions(new int[] { 3, 5 });

Merger merger = new Merger(filePath);

merger.removePages(removeOptions);
merger.save(filePathOut);

```

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
