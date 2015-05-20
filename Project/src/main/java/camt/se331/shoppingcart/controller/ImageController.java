//package camt.se331.shoppingcart.controller;
//
//import camt.se331.shoppingcart.entity.Image;
//import camt.se331.shoppingcart.service.ImageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Created by KalumDog on 20/5/2558.
// */
//@RestController
//public class ImageController {
//    @Autowired
//    ImageService imageService;
//    @RequestMapping(value = "imgcontrol/{id}/{imgid}",method = RequestMethod.DELETE)
//    public Image deleteimage(@PathVariable("id") Long id,@PathVariable("imgid") long imgid){
//
//
//
//        return imageService.delete(imgid,id);
//    }
//    @RequestMapping(value = "historycontrol/{imgid}",method = RequestMethod.DELETE)
//    public Image deletehistoryimage(@PathVariable("imgid") Long imgid){
//
//
//
//        return imageService.deleteHistoryImg(imgid);
//    }
//}
