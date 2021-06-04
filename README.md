# Java Library to Combine & Split Documents

[GroupDocs.Merger for Java](https://products.groupdocs.com/merger/java) allows developers to join multiple documents and manipulate document structure across wide range of [supported document formats](https://docs.groupdocs.com/merger/java/supported-document-formats/). The Merger API also allows to reorder or replace document pages, change page orientation, manage document password and more.  

<p align="center">
  <a title="Download complete GroupDocs.Merger for Java source code" href="https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java/archive/master.zip"> 
    <img src="https://camo.githubusercontent.com/11839cd752a2d367f3149c7bee1742b68e4a4d37/68747470733a2f2f7261772e6769746875622e636f6d2f4173706f73654578616d706c65732f6a6176612d6578616d706c65732d64617368626f6172642f6d61737465722f696d616765732f646f776e6c6f61645a69702d427574746f6e2d4c617267652e706e67" data-canonical-src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" style="max-width:100%;">
  </a>
</p>

Directory | Description
--------- | -----------
[Docs](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Docs)  | Product documentation containing the Developer's Guide, Release Notes and more.
[Examples](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java/tree/master/Examples)  | Java examples and sample documents for you to get started quickly. 

## Merge or Split Documents via Java

- [Merge two or more documents into one document](https://docs.groupdocs.com/merger/java/merge-files/).
- Join specific pages or page ranges from several source documents into a single document.
- [Divide a document into several resultant documents](https://docs.groupdocs.com/merger/java/split-document/).
- Move page to another position within a document.
- Remove single page or a collection of specific page numbers from the source document.
- Rotate pages within a document. Rotate pages by setting rotation angle to 90,180 or 270 degrees.
- Swap two pages within the source document.
- [Extract specified page or page ranges from a document](https://docs.groupdocs.com/merger/java/extract-pages/). 
- Set page's orientation (portrait, landscape) for specific or all pages of the document.
- Manage document's protection.
- Obtain document's basic information such as file type, size, pages count, page height & width.
- [Generate image representations of document pages](https://docs.groupdocs.com/merger/java/generate-document-pages-preview/).

## Get Started with GroupDocs.Merger for Java

GroupDocs.Merger for Java requires J2SE 6.0 (1.6), J2SE 7.0 (1.7), J2SE 8.0 (1.8) or above. Please install Java first if you do not have it already. 

GroupDocs hosts all Java APIs on [GroupDocs Artifact Repository](https://artifact.groupdocs.com/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-merger), so simply [configure](https://docs.groupdocs.com/merger/java/installation/) your Maven project to fetch the dependencies automatically.

## Merge Different Documents as PDF

```java
Merger merger = new Merger("document1.pdf");
{
    merger.join("document2.doc");
    merger.join("document3.ppt");
    merger.join("document4.xls");
    merger.save("c:\merged.pdf");
}
```

## Embed PDF into DOCX as OLE Object

```java
int pageNumber = 2;
OleWordProcessingOptions oleWordsOptions = new OleWordProcessingOptions("embedded.pdf", pageNumber);
oleWordsOptions.setWidth(300);
oleWordsOptions.setHeight(300);

Merger merger = new Merger("sample.docx");
{
    merger.importDocument(oleWordsOptions);
    merger.save("result.docx");
}
```

[Home](https://www.groupdocs.com/) | [Product Page](https://products.groupdocs.com/merger/java) | [Documentation](https://docs.groupdocs.com/merger/java/) | [Demos](https://products.groupdocs.app/merger/family) | [API Reference](https://apireference.groupdocs.com/java/merger) | [Examples](https://github.com/groupdocs-merger/GroupDocs.merger-for-Java/tree/master/Examples) | [Blog](https://blog.groupdocs.com/category/merger/) | [Free Support](https://forum.groupdocs.com/c/merger) | [Temporary License](https://purchase.groupdocs.com/temporary-license)
