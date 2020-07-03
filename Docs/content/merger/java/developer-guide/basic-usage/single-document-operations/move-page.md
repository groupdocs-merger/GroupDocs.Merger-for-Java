---
id: move-page
url: merger/java/move-page
title: Move page
weight: 1
description: "This article demonstrates how to move document page to another position within PDF, Word, Excel, PowerPoint document using GroupDocs.Merger for Java API."
keywords: Move document page, Move PDF page, Move Word document page, Move page to another position
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) provides a move page feature which allows you to manipulate page ordering by moving any page(s) to new position within a document.   
This can be done by following the steps below:

*   Initialise [MoveOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/MoveOptions) class and specify current and new page numbers;
*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or InputStream;
*   Call [movePage](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#movePage(com.groupdocs.merger.domain.options.interfaces.IMoveOptions)) method and pass [MoveOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/MoveOptions) object to it;
*   Call [save](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#save(java.lang.String)) method and pass desired file path to save resultant document.

The following code sample demonstrates on how to move page to a new position:

```java
String filePath = "c:\sample.xlsx";
String filePathOut = "c:\output\result.xlsx";
 
int pageNumber = 6;
int newPageNumber = 1;
MoveOptions moveOptions = new MoveOptions(pageNumber, newPageNumber);

Merger merger = new Merger(filePath);

merger.movePage(moveOptions);
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
