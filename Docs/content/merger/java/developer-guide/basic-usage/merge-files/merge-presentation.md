---
id: merge-presentation
url: merger/java/merge-presentation
title: Merge Presentation
weight: 2
description: "This article explains how to merge PowerPoint presentations, combine several PPTX or PPT files into one using GroupDocs.Merger for Java API and couple lines of code."
keywords: Merge PowerPoint, Merge Presentations, Merge PPT, Merge PPTX, Merge PPSX, Merge PPS, Join PowerPoint, Combine PowerPoint with GroupDocs.Merger for Java
productName: GroupDocs.Merger for Java
hideChildren: False
---
**[GroupDocs.Merger](https://products.groupdocs.com/merger/java)** exposes powerful and easy to use API to merge PowerPoint and Open Document presentations of PPT, PPTX, PPS, PPSX and ODP, OTP formats. Presentations can be combined as a whole or on a page by page basis depending on your requirements. The big advantage of GroupDocs.Merger is that presentations can be merged programmatically without any third-party software installed (like Microsoft PowerPoint or Open Office) or manual work.  
GroupDocs.Merger combines presentations with all their content with no quality and data loss - text formatting, comments, animations, smart arts, shapes, etc.  
  
GroupDocs.Merger API provides different overloads of [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String)) method to combine additional files with the source document loaded into [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object. 

*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang")) - allows to merge document provided via file path on a local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io")) - provides an ability to combine documents loaded from any source - memory stream, remote URL etc.;
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true "class or interface in java.lang"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces")) - is used for merging specific pages for document stored at local disk; 
*   [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.io.InputStream,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions))([InputStream](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html?is-external=true "class or interface in java.io"), [IJoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options.interfaces/IJoinOptions "interface in com.groupdocs.merger.domain.options.interfaces")) - used for merging specific pages from document provided as a stream.

The following example demonstrates how to merge presentations with several lines of code:

```java
Merger merger = new Merger(@"c:\presentation1.ppt"); 
merger.join(@"c:\presentation2.ppt");
merger.save(@"c:\merged.ppt");
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
