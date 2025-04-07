package com.XworkZ;

public class ReportDetails {
    public void Details(Report report)
    {
        report.conclusion();
        report.introduction();
        report.flowChart();
        report.result();
        report.systemDesign();
        if(report instanceof Document)
        {
            Document document =(Document) report;
            document.Cover();
        }
    }
}
