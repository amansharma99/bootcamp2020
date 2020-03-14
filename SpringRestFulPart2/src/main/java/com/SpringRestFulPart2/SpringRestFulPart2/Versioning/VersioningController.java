package com.SpringRestFulPart2.SpringRestFulPart2.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
    //URI Version
   @GetMapping("/Newversion")
   public Newversion urinew(){return new Newversion(new User1(1,"Aman",23,"GR.NOIda"));}
   @GetMapping("/Oldversion")
   public Oldversion uriold(){return new Oldversion(new User1(1,"Aman"));}

   //RequestMapping
   @GetMapping(value = "Oldversion/param",params = "Version=1")
   public Oldversion requestmappingold(){return new Oldversion(new User1(1,"Aman"));}


    @GetMapping(value = "Newversion/param",params = "Version=2")
    public Newversion requestmappingnew(){return new Newversion(new User1(1,"Aman",23,"GR.NOIda"));}


    //CustomHeaderVersioning
   @GetMapping(value = "Oldversion/header",headers = "X-API-VERSION=1")
    public Oldversion customheaderold(){return new Oldversion(new User1(1,"Aman"));}


    @GetMapping(value = "Newversion/header",headers = "X-API-VERSION=2")
    public Newversion customheadernew(){return new Newversion(new User1(1,"Aman",23,"GR.NOIda"));}


    //MimeType Versioning
   @GetMapping(value = "Oldversion/produces",produces = "application/und.company.app-VI+JSON")
    public Oldversion mimeold(){return new Oldversion(new User1(1,"Aman"));}


    @GetMapping(value = "Newversion/produces",produces = "application/und.company.app-VI+JSON")
    public Newversion mimenew(){return new Newversion(new User1(1,"Aman",23,"GR.NOIda"));}



}
