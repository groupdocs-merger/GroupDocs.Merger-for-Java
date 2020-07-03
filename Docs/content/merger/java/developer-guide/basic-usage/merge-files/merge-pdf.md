---
id: merge-pdf
url: merger/java/merge-pdf
title: Merge PDF
weight: 1
description: "Follow this guide and learn how to merge PDF files, combine several PDFs into one using GroupDocs.Merger for Java API and couple lines of code"
keywords: Merge PDF, Combine PDF, Join PDF, Merge PDF with GroupDocs.Merger for Java
productName: GroupDocs.Merger for Java
hideChildren: False
---
**[GroupDocs.Merger](https://products.groupdocs.com/merger/java)** allows you to merge PDF files when it's needed to organize multiple PDFs into single document or send fewer attachments etc. And you can do this without any third-party software or manual work involved.  
With GroupDocs.Merger it is possible to combine PDF documents of any size and structure - all text, images, tables, graphs, forms and other content will be preserved.   
Supported PDF format versions are 1.2, 1.3, 1.4, 1.5, 1.6 and 1.7.

GroupDocs.Merger API provides several overloads of [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String)) method to combine additional files with the source document loaded into [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object. 

*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang")) - allows to merge document provided via file path on a local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io")) - provides an ability to combine documents loaded from any source - memory stream, remote URL etc.;
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces"))  - is used for merging specific pages for document stored at local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces")) - used for merging specific pages from document provided as a stream.

The following example demonstrates how to merge PDF files with several lines of code:

```java
Merger merger = new Merger(@"c:\document1.pdf"); 
merger.join(@"c:\document2.pdf");
merger.save(@"c:\merged.pdf");
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
