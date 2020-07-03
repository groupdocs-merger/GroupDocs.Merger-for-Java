---
id: load-document-from-url
url: merger/java/load-document-from-url
title: Load document from URL
weight: 3
description: "This article explains how to load PDF, Word, Excel, PowerPoint documents from local disk when using GroupDocs.Merger for Java."
keywords: Load document from local disk, Load document from file path, Load document with GroupDocs.Merger
productName: GroupDocs.Merger for Java
hideChildren: False
---
Following example demonstrates how to load document from URL.

```java
String url = "https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java/blob/master/Examples/Resources/SampleFiles/Pdf/sample.pdf?raw=true";
try {
    InputStream stream = new java.net.URL(url).openStream();

    LoadOptions loadOptions = new LoadOptions(FileType.PDF);
    Merger merger = new Merger(stream, loadOptions);
    System.out.print("Document loaded from URL successfully.");
} catch ( Exception e){
    throw new GroupDocsMergerException(e.getMessage());
}
```

## More resources
### GitHub Examples 
You may easily run the code above and see the feature in action in our GitHub examples:
*   [GroupDocs.Merger for .NET examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-.NET)    
*   [GroupDocs.Merger for Java examples, plugins and showcase](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java)

### Free Online App 
Along with full featured Java library we provide simple, but powerful free Apps.
You are welcome to merge your documents with our free online **[GroupDocs Merger App](https://products.groupdocs.app/merger)**.
