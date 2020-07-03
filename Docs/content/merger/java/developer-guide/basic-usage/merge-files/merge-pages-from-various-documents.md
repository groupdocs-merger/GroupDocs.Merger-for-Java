---
id: merge-pages-from-various-documents
url: merger/java/merge-pages-from-various-documents
title: Merge pages from various documents
weight: 4
description: " This article explains how to merge some pages from different documents into single PDF, DOCX, Excel or PowerPoint document using GroupDocs.Merger for Java."
keywords: Merge PDF pages into one PDF document, Combine document pages into single document, Merge pages into document using GroupDocs.Merger for Java
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) allows to merge the source document with specific document pages from joined document into one resultant document by specifying desired page numbers or page ranges. Joined documents should be of the same format.

 Here are the steps to join several document parts:

*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or InputStream;
*   Instantiate [JoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/JoinOptions) object and specify desired page numbers or page range to join;
*   Call [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String,%20com.groupdocs.merger.domain.options.interfaces.IJoinOptions)) method and pass joined document file path or InputStream to it specifying [JoinOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/JoinOptions) object as parameter. Repeat this step for every joined document part.
*   Call [save](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#save(java.lang.String)) method specifying file path to save resultant document.

The following code sample demonstrates how to join document parts:

```java
String filePath = "c:\sample.docx";
String filePath2 = "c:\sample2.docx";
String filePathOut = "c:\output\result.docx";

JoinOptions joinOptions = new JoinOptions(1, 2);

Merger merger = new Merger(filePath);
merger.join(filePath2 , joinOptions);
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
