---
id: groupdocs-merger-for-java-20-7-release-notes
url: merger/java/groupdocs-merger-for-java-20-7-release-notes
title: GroupDocs.Merger for Java 20.7 Release Notes
weight: 20
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 20.7{{< /alert >}}

## Major Features

There are a few new other features in this regular monthly release. The most notable are:

*   Implemented document import of all the possible file types into Presentation;
*   Implemented document import of all the possible file types into Word processing;
*   Implemented document import of all the possible file types into Spreadsheet;
*   Implemented document import of all the possible file types into PDF;
*   Cross-format merging to PDF.

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-829 | Cross-format merging to PDF | Feature |
| MERGERNET-833 | Implement adding PDF document attachments | Feature |
| MERGERNET-832 | Implement OLE objects import into Ms Excels and Open Document spreadsheets | Feature |
| MERGERNET-830 | Implement OLE objects import into MS PowerPoint and Open Document presentations | Feature |
| MERGERNET-831 | Implement OLE objects import into MS Word documents | Feature |

## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 20.7. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

### New ImportDocument method was added to Merger class

**[ImportDocument](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#importDocument(com.groupdocs.merger.domain.options.interfaces.IImportDocumentOptions))** method was added to GroupDocs.Merger for Java product, please refer to the following documentation articles for more details: 

*   [Supported Document Types]({{< ref "merger/java/getting-started/supported-document-formats.md" >}})
*   [Import documents]({{< ref "merger/java/developer-guide/basic-usage/import-documents/_index.md" >}})
*   [Merge documents to PDF]({{< ref "merger/java/developer-guide/basic-usage/merge-files/merge-documents-to-pdf.md" >}}).
