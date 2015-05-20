//package camt.se331.shoppingcart.dao;
//
//import camt.se331.shoppingcart.entity.Image;
//import camt.se331.shoppingcart.repository.ImageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by KalumDog on 20/5/2558.
// */
//@Repository
//public class DbImageDao implements  ImageDao{
//
//    @Autowired
//    ImageRepository imageRepository;
//    @Override
//    public List<Image> getImages() {
//        return imageRepository.findAll();
//    }
//
//    @Override
//    public Image Get(Long id) {
//
//        return imageRepository.findOne(id);
//    }
//
//    @Override
//    public Image Update( Image img) {
//        return imageRepository.save(img);
//    }
//
//    @Override
//    public Image add(Image img) {
//        return imageRepository.save(img);
//    }
//
//    @Override
//    public Image delete(Image img) {
//        imageRepository.delete(img);
//        return img;
//    }
//}
