//package com.glossary.glossary.saveFile;
//
//import com.glossary.glossary.entity.Word;
//import com.glossary.glossary.repo.WordRepo;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.poi.xwpf.usermodel.XWPFDocument;
//import org.apache.poi.xwpf.usermodel.XWPFParagraph;
//import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.io.*;
//
//import org.apache.poi.poifs.filesystem.POIFSFileSystem;
//
//
//@Slf4j
//@Controller
//@RequestMapping("/file")
//public class SaveFileController {
//
//    private WordRepo wordRepo;
//
//    @Autowired
//    public SaveFileController(WordRepo wordRepo) {
//        this.wordRepo = wordRepo;
//    }
//
//
//    @PostMapping()
//    public String createFile(){
//        save(wordRepo.findAll());
//        return "redirect:/";
//    }
//
//
//    public void save(Iterable<Word> words){
//
//        XWPFDocument document=new XWPFDocument();
//        XWPFParagraph paragraph=document.createParagraph();
//        XWPFRun run=paragraph.createRun();
//    try{
//        FileOutputStream output = new FileOutputStream("C:\\Users\\artem\\OneDrive\\Рабочий стол\\test\\test.docx");
//        words.forEach(e-> {
//                run.setText(e.getEng()+" - "+e.getRus()+"\n");
//                run.addBreak();
//
//        });
//                document.write(output);
//                    output.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//        e.printStackTrace();
//    }
//    }
//
//
//}
