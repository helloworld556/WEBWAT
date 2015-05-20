//package camt.se331.shoppingcart.service;
//
//import camt.se331.shoppingcart.dao.QuestionDao;
//import camt.se331.shoppingcart.entity.QuestionAnswer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
///**
// * Created by KalumDog on 20/5/2558.
// */
//@Service
//@Transactional
//public class QuestionServiceImpl implements QuestionService {
//    @Autowired
//    QuestionDao questionDAO;
//    @Override
//    public List<QuestionAnswer> getQuestionAnswers() {
//        return questionDAO.getQuestionList();
//    }
//
//    @Override
//    public QuestionAnswer getQuestionAnswer(Long id) {
//        return questionDAO.getQuestion(id);
//    }
//
//    @Override
//    public QuestionAnswer addQuestionAnswer(QuestionAnswer question) {
//        return questionDAO.addQuestion(question);
//    }
//
//    @Override
//    public QuestionAnswer deleteQuestionAnswer(Long id) {
//        QuestionAnswer q=questionDAO.getQuestion(id);
//        return questionDAO.deleteQuestion(q);
//    }
//
//    @Override
//    public QuestionAnswer updateQuestionAnswer(QuestionAnswer question) {
//        return questionDAO.editQuestion(question);
//    }
//}
