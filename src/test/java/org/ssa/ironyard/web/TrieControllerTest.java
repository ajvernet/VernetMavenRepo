//package org.ssa.ironyard.web;
//
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.mock.web.MockHttpServletRequest;
//
//public class TrieControllerTest {
//    
//    TrieController trieController = new TrieController();
//    
//    
//    @Before
//    public void so()
//    {
//        this.trieController = new TrieController();
//    }
//
//    @Test
//    public void empty() {
//        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/trie");
//        request.setParameter("digits","abcd");
//        this.trieController.getCorn(request);
//    }
//    
////    @Test
////    public void success() throws URISyntaxExcepion
////    {
////        this.trieController.setT(new Mock9Trie());
////        MockHttpServletRequest request = new MockHttpServletRequest("")
////    }
//    
//
//}
//
//class Mock9Trie implements Text9Trie
//{
//
//    public void addWord(String word) {
//        // TODO Auto-generated method stub
//        
//    }
//
//    public boolean contains(String word) {
//        // TODO Auto-generated method stub
//        return false;
//    }
//
//    public boolean remove(String word) {
//        // TODO Auto-generated method stub
//        return false;
//    }
//
//    public void clear() {
//        // TODO Auto-generated method stub
//        
//    }
//
//    public List<String> suggest(String digits) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//}