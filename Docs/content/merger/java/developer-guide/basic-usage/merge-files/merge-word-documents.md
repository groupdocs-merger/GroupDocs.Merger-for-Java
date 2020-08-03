---
id: merge-word-documents
url: merger/java/merge-word-documents
title: Merge Word documents
weight: 3
description: "Follow this guide and learn how to merge Word documents, combine several DOCX or DOC files into one using GroupDocs.Merger for Java."
keywords: Merge Word, Merge DOCX, Merge DOC, Join DOCX, Combine DOC with GroupDocs.Merger for Java
productName: GroupDocs.Merger for Java
hideChildren: False
---
**[GroupDocs.Merger](https://products.groupdocs.com/merger/java)** provides an easy way to merge Microsoft Word documents of DOC, DOCX, DOCM, DOT, DOTX, DOTM, RTF formats and Open Document formats like ODT, OTT etc. It takes just single line of code to append one document to another preserving all content - page setup, headers and footers, formatting, styles and other content. There is no third-party applications required (like Microsoft Word and Open Office).   
  
GroupDocs.Merger API provides different overloads of [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String)) method to combine additional files with the source document loaded into [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object. 

*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang")) - allows to merge document provided via file path on a local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io")) - provides an ability to combine documents loaded from any source - memory stream, remote URL etc.;
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces")) - is used for merging specific pages for document stored at local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces")) - used for merging specific pages from document provided as a stream.

This code sample shows how to merge Microsoft Word documents:

```java
Merger merger = new Merger(@"c:\document1.docx"); 
merger.join(@"c:\document2.docx");
merger.save(@"c:\merged.docx");
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
