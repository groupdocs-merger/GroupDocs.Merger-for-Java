---
id: split-text-file
url: merger/java/split-text-file
title: Split text file
weight: 4
description: "Follow this guide and learn how to split text file into several resultant files using GroupDocs.Merger for Java API."
keywords: Split file, Split text file, Split text by line number
productName: GroupDocs.Merger for Java
hideChildren: False
---
[**GroupDocs.Merger**](https://products.groupdocs.com/merger/java) allows to split text file into several resultant text files. The default behavior is to split each line into separate file.  
Here are the steps on how to split text file as described:

*   Initialize [TextSplitOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/TextSplitOptions) class with output files path format, desired [TextSplitMode](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/TextSplitMode) and line numbers;
*   Instantiate [Merger](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger) object with source document path or InputStream;
*   Call [split](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger/Merger#split(com.groupdocs.merger.domain.options.interfaces.ITextSplitOptions)) method and pass [TextSplitOptions](https://apireference.groupdocs.com/java/merger/com.groupdocs.merger.domain.options/TextSplitOptions) object to itfor saving resultant text files.

### Split text file to several one-line files (by exact line numbers)

The following code sample demonstrates how to split text file to two one-page documents with 3rd, 6th lines from source file:

```java
String filePath = "c:\sample.txt";
String filePathOut = "c:\output\line_{0}.{1}";

TextSplitOptions splitOptions = new TextSplitOptions(filePathOut, new int[] { 3, 6 });

Merger merger = new Merger(filePath);
merger.split(splitOptions);
```

This code snippet will produce:

| Text file | Line numbers |
| --- | --- |
| line_0 | 3 |
| line_1 | 6 |

### Split text file to several multi-line files 

The following code sample demonstrates how to split text file to several multi-line files starting from 3rd and ending at 6th line numbers:

```java
String filePath = "c:\sample.txt";
String filePathOut = "c:\output\text_{0}.{1}";

TextSplitOptions splitOptions = new TextSplitOptions(filePathOut, TextSplitMode.Interval, new int[] { 3, 6 });

Merger merger = new Merger(filePath);
merger.split(splitOptions);
```

This code snippet will produce:

| Text file | Line numbers |
| --- | --- |
| text_0 | 1, 2 |
| text_1 | 3, 4, 5 |
| text_2 | 6 |

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
