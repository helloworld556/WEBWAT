//package camt.se331.shoppingcart.dao;
//
//import camt.se331.shoppingcart.entity.QuestionAnswer;
//import camt.se331.shoppingcart.repository.QuestionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by KalumDog on 20/5/2558.
// */
//@Repository
//public class DbQuestionDao implements QuestionDao {
//    @Autowired
//    QuestionRepository questionRepository;
//    @Override
//    public List<QuestionAnswer> getQuestionList() {
//        return questionRepository.findAll();
//    }
//
//    @Override
//    public QuestionAnswer getQuestion(Long id) {
//        return questionRepository.findOne(id);
//    }
//
//    @Override
//    public QuestionAnswer addQuestion(QuestionAnswer q) {
//        return questionRepository.save(q);
//    }
//
//    @Override
//    public QuestionAnswer editQuestion(QuestionAnswer q) {
//
//        return questionRepository.save(q);
//    }
//
//    @Override
//    public QuestionAnswer deleteQuestion(QuestionAnswer q) {
//        questionRepository.delete(q);
//        q.setId(null);
//        return q;
//    }
//}