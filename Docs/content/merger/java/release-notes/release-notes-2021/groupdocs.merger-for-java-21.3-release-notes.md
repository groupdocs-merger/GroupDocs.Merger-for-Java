---
id: groupdocs-merger-for-java-21-3-release-notes
url: merger/java/groupdocs-merger-for-java-21-3-release-notes
title: GroupDocs.Merger for Java 21.3 Release Notes
weight: 120
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 21.3{{< /alert >}}

## Major Features

There are a few fixed bugs in this regular monthly release. The most notable are:

*   Impemented text .err format for splitting;
*   Impemented text .err format for joining.
*   Cross-format merging to DOC / DOCX;
*   Cross-format merging to XPS;
*   Split page number is not correct.
*   Big size of the MTHML merged document;
*   Cannot access a closed Stream;
*   Object reference not set to an instance of an object.
*   Parsing of table 'GPOS' has failed.


## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-517 | Impement text .err format for splitting | Feature |
| MERGERNET-534 | Impement text .err format for joining | Feature |
| MERGERNET-828 | Cross-format merging to DOC / DOCX | Feature |
| MERGERNET-966 | Cross-format merging to XPS | Feature |
| MERGERNET-967 | Split page number is not correct | Bug |
| MERGERNET-987 | Big size of the merged document | Bug |
| MERGERNET-1009 | Cannot access a closed Stream | Bug |
| MERGERNET-1010 | Object reference not set to an instance of an object | Bug |
| MERGERNET-1032 | Parsing of table 'GPOS' has failed | Bug |



## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 21.3. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

### The existing Join method of the Merger class was expanded

**[Join](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#join(java.io.InputStream) )** and **[Split](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#split(com.groupdocs.merger.domain.options.interfaces.ISplitOptions) )** method of the GroupDocs.Merger for Java product was expanded, please refer to the following documentation articles for more details: 

*   [Supported Document Types]({{< ref "merger/java/getting-started/supported-document-formats.md" >}});
*   [Merge documents to PDF]({{< ref "merger/java/developer-guide/basic-usage/merge-files/merge-documents-to-pdf.md" >}});
*   [Merge documents to DOC]({{< ref "merger/java/developer-guide/basic-usage/merge-files/merge-documents-to-doc.md" >}});
*   [Split document]({{< ref "merger/java/developer-guide/basic-usage/single-document-operations/split-document.md" >}}).
