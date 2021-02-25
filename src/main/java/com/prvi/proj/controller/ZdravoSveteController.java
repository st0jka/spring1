package com.prvi.proj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.io.Reader;
import java.io.Writer;

@Controller
@RequestMapping(value = "/ZdravoSvete")
public class ZdravoSveteController {

    @Value("${kursnalista.api.key}")
    private String kursnaListaApiKey;

    @Value("${server.servlet.contextPath}")
    private String contextPath;
    @GetMapping
    @ResponseBody
    public String getZdravo1(){
        String retHtml = "" +
                "<html>" +
                "<head>" +
                "<meta cjarset = \"UTF-8\">" +
                "<title> Zdravo svete 1 </title>" +
                "</head>" +
                "<body>" +
                "<h1> Zdravo svete 1  </h1>" +
                "</body>" +
                "</html";
        return retHtml;
    }

    @GetMapping(value={"/Zdravo2", "/Zdravo2-DrugaPutanja"})
    @ResponseBody
    public String getZdravo2(){
        String retHtml = "" +
                "<html>" +
                "<head>" +
                "<meta cjarset = \"UTF-8\">" +
                "<title> Zdravo svete 2 </title>" +
                "</head>" +
                "<body>" +
                "<h1> Zdravo svete 2 izmena123 345 123 asd asd 1234</h1>" +
                "</body>" +
                "</html";
        return retHtml;
    }

    @GetMapping(value="/zdravo3")
    @ResponseBody
    public String getZdravo3() {
        String html = "<html><head></head>"
                + "<body><h1>PRODAJA GUMA</h1><ul><li>*R14</li><li>*R15</li><li>*R16</li></ul>" +
                "<div><h1>KONTAKT PODACI</h1></div>" +
                "<h2>GUMATIK</h2><br/><h3>555333</h3>" +
                this.kursnaListaApiKey+
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping(value = "/zdravo4")
    public void getZdravo4(Reader in, Writer out){
        try {
            out.write("<html><head><title>Zdravo svete 4</title></head><body><h1> Zdravo svete 4 </h1> </body></html>");
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @GetMapping(value = "/jsp")
    public ModelAndView firstView()
    {
        System.out.println("First view trigerred");
        ModelAndView mav = new ModelAndView("test/greet");
        // must match the jsp page name which is being requested.
        mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
        return mav;
    }
}
