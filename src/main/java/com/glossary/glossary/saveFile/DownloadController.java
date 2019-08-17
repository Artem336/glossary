package com.glossary.glossary.saveFile;

import com.glossary.glossary.entity.Word;
import com.glossary.glossary.repo.WordRepo;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.xml.ws.spi.http.HttpHandler;
import java.io.*;

@Controller
public class DownloadController {


    private ServletContext servletContext;
    private WordRepo repo;


    @Autowired
    public DownloadController(ServletContext servletContext, WordRepo repo) {
        this.servletContext = servletContext;
        this.repo = repo;
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamResource> downloadFile() throws FileNotFoundException {
        save(repo.findAll());
        MediaType mediaType=MediaTypeUtils.getMediaTypeForFileName(this.servletContext,"test.docx");
        File file=new File("C:\\Users\\artem\\OneDrive\\Рабочий стол\\test\\test.docx");
        InputStreamResource resource=new InputStreamResource(new FileInputStream(file));
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename="+file.getName())
                .contentType(mediaType)
                .contentLength(file.length())
                .body(resource);
    }


    public void save(Iterable<Word> words){

        XWPFDocument document=new XWPFDocument();
        XWPFParagraph paragraph=document.createParagraph();
        XWPFRun run=paragraph.createRun();
        run.setFontSize(22);
        run.setBold(true);
        try{
            FileOutputStream output = new FileOutputStream("C:\\Users\\artem\\OneDrive\\Рабочий стол\\test\\test.docx");
            words.forEach(e-> {
                run.setText(e.getEng()+" - "+e.getRus()+"\n");
                run.addBreak();
            });
            document.write(output);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
