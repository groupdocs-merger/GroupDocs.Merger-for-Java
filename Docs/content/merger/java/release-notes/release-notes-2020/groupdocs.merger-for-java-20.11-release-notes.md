---
id: groupdocs-merger-for-java-20-11-release-notes
url: merger/java/groupdocs-merger-for-java-20-11-release-notes
title: GroupDocs.Merger for Java 20.11 Release Notes
weight: 10
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 20.11{{< /alert >}}

## Major Features

There are a few fixed bugs under .Net Core platform in this regular monthly release. The most notable are:

*   System.NotSupportedException : Could not open display (X-Server required. Check your DISPLAY environment variable);
*   System.Exception : 'file:///d:/EPUB/out.xhtml' could not be found;
*   System.DllNotFoundException : Unable to load shared library 'gdi32.dll' or one of its dependencies. In order to help diagnose loading problems, consider setting the LD_DEBUG environment variable: libgdi32.dll: cannot open shared object file: No such file;
*   KeyNotFoundException: The given key 'Wingdings' was not present in the dictionary;
*   System.PlatformNotSupportedException : COM Interop is not supported on this platform;
*   MHT and MHTML file types have only one page under Linux and could not be used for the page modification.
*   Implemented document import of all the possible file types into Diagram.
*   Corrupt file error message when merging memory stream files;
*   Can't remove Words document pages;
*   Can't save PDF file;
*   Can't remove pages from Excel file;
*   Not supported file types are present;
*   Cannot open a PDF with 250+ long characters password.

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-876 | System.NotSupportedException : Could not open display (X-Server required. Check your DISPLAY environment variable) | Bug |
| MERGERNET-877 | System.Exception : 'file:///d:/EPUB/out.xhtml' could not be found | Bug |
| MERGERNET-878 | System.DllNotFoundException : Unable to load shared library 'gdi32.dll' or one of its dependencies. In order to help diagnose loading problems, consider setting the LD_DEBUG environment variable: libgdi32.dll: cannot open shared object file: No such file | Bug |
| MERGERNET-880 | KeyNotFoundException: The given key 'Wingdings' was not present in the dictionary | Bug |
| MERGERNET-886 | System.PlatformNotSupportedException : COM Interop is not supported on this platform | Bug |
| MERGERNET-888 | MHT and MHTML file types have only one page under Linux and could not be used for the page modification | Bug |
| MERGERNET-855 | Implement Ole objects import into Diagram documents | Feature |
| MERGERNET-936 | Corrupt file error message when merging memory stream files | Bug |
| MERGERNET-937 | Can't remove Words document pages | Bug |
| MERGERNET-938 | Can't save PDF file | Bug |
| MERGERNET-939 | Can't remove pages from Excel file | Bug |
| MERGERNET-940 | Not supported file types are present | Bug |
| MERGERNET-942 | Cannot open a PDF with 250+ long characters password | Bug |

## Public API and Backward Incompatible Changes

{{< alert style="info" >}}This section lists public API changes that were introduced in GroupDocs.Merger for Java 20.11. It includes not only new and obsoleted public methods, but also a description of any changes in the behavior behind the scenes in GroupDocs.Merger which may affect existing code. Any behavior introduced that could be seen as a regression and modifies existing behavior is especially important and is documented here.{{< /alert >}}

### New ImportDocument method of Merger class was expanded

**[ImportDocument](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger#importDocument(com.groupdocs.merger.domain.options.interfaces.IImportDocumentOptions))** method of GroupDocs.Merger for Java product was expanded, please refer to the following documentation articles for more details: 

*   [Supported Document Types]({{< ref "merger/java/getting-started/supported-document-formats.md" >}})
*   [Import documents]({{< ref "merger/java/developer-guide/basic-usage/import-documents/_index.md" >}}).
