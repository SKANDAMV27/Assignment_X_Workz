package com.XworkZ;

public class PaperDetails {
    public void details(Paper paper){
        paper.color();
        paper.company();
        paper.price();
        paper.size();
        paper.type();
        if(paper instanceof Sheet)
        {
            Sheet sheet =(Sheet)paper;
            sheet.quality();
        }
    }
}
