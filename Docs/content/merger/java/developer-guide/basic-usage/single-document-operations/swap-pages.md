---
id: swap-pages
url: merger/java/swap-pages
title: Swap pages
weight: 5
description: "This article explains how to rearrange document pages for PDF, Word, Excel, PowerPoint and many other file types using GroupDocs.Merger for Java."
keywords: Swap document pages, Change document pages position, Rearrange document pages, Swap PDF pages, Swap Word document pages, Swap Excel worksheets, Rearrange PDF pages
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) allows to swap two pages positions within the source document. The result is a new document where two pages have their positions exchanged.

Here are the steps to swap document pages:

*   Initialize [SwapOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/SwapOptions) class with page numbers to swap;
*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or InputStream;
*   Call [swapPages](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#swapPages(com.groupdocs.merger.domain.options.interfaces.ISwapOptions)) method and pass [SwapOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/SwapOptions) object to it;
*   Call [save](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#save(java.lang.String)) method specifying file path to save resultant document.

The following code sample demonstrates how to split document:

```java
String filePath = "c:\sample.pptx";
String filePathOut = "c:\output\result.pptx";

int pageNumber1 = 3;
int pageNumber2 = 6;
SwapOptions swapOptions = new SwapOptions(pageNumber2, pageNumber1);

Merger merger = new Merger(filePath);        
merger.swapPages(swapOptions);
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
