//package camt.se331.shoppingcart.service;
//
//import camt.se331.shoppingcart.dao.ImageDao;
//import camt.se331.shoppingcart.entity.Image;
//import camt.se331.shoppingcart.repository.HistoryRepository;
//import camt.se331.shoppingcart.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
///**
// * Created by KalumDog on 20/5/2558.
// */
//public class imageServiceImpl implements ImageService{
//    @Autowired
//    ImageDao imgdao;
//    @Autowired
//    ProductRepository productRepository;
//    @Autowired
//    HistoryRepository historyRepository;
//    @Override
//    public List<Image> getImages() {
//        return imgdao.getImages();
//    }
//
//    @Override
//    public Image getImg(Long id) {
//        return imgdao.Get(id);
//    }
//
//    @Override
//    public Image Update(Image img) {
//        return imgdao.Update(img);
//    }
//
//    @Override
//    public Image add(Image img) {
//        return imgdao.add(img);
//    }
//
//    @Override
//    public Image delete(Long imgid,Long activityid) {
//        productRepository.getOne(activityid).getImages().remove(imgdao.Get(imgid));
//        Image temp=imgdao.Get(imgid);
//
//        return imgdao.delete(temp);
//    }
//
//    @Override
//    public Image deleteHistoryImg(Long id) {
//        historyRepository.findOne(1l).getImages().remove(imgdao.Get(id));
//        Image temp=imgdao.Get(id);
//        return imgdao.delete(temp);
//    }
//}
