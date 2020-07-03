---
id: merge-files
url: merger/java/merge-files
title: Merge files
weight: 3
description: "This article explains how to merge files of PDF, Microsoft Word, Excel and PowerPoint and other formats using GroupDocs.Merger for Java API."
keywords: Merge files, Combine files, Merge documents, Merge document with GroupDocs.Merger for Java
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) allows to merge two or more documents into single resultant document. The result will contain the content of all source documents with all data, styles and formatting. 

 Here are the steps to merge several documents:

*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or InputStream;
*   Call [join](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#join(java.lang.String)) method and pass next joined document file path or InputStream to it. Repeat this step for every joined document.
*   Call [save](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#save(java.lang.String)) method specifying file path to save resultant document.

The following code sample demonstrates how to join documents:

```java
String filePath1 = "c:\sample1.docx";
String filePath2 = "c:\sample2.docx";
String filePath3 = "c:\sample3.docx";
String filePathOut = "c:\output\result.docx";

Merger merger = new Merger(filePath1 );

merger.join(filePath2 );
merger.join(filePath3 );
merger.save(filePathOut);   
```

Please learn more about how to merge PDF, Microsoft Word, Microsoft PowerPoint or Open Document documents from the articles listed below:

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
