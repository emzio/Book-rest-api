//package pl.coderslab.conf;
//
//import pl.coderslab.entity.Book;
//import pl.coderslab.service.MockBookService;
//
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        MockBookService mockBookService = new MockBookService();
//        mockBookService.findAll().stream()
//                .forEach(System.out::println);
//        System.out.println(">>>>>>>>>>>3<<<<<<<<<<");
//        System.out.println(mockBookService.findById(3L));
//        mockBookService.remove(2L);
//        System.out.println(">>>>>>>>>>><<<<<<<<<<");
//        mockBookService.findAll().stream().forEach(System.out::println);
//        System.out.println(">>>>>>>>>>>3<<<<<<<<<<");
//        System.out.println(mockBookService.findById(3L));
//        mockBookService.add(new Book("654", "6title", "6Zysk", "6childs", "6JK Rowling"));
//        System.out.println(">>>>>>>>>>>6<<<<<<<<<<");
//        mockBookService.findAll().stream().forEach(System.out::println);
//        System.out.println(">>>>>>>>>>>Update<<<<<<<<<<");
//        Book bookToUpdate = new Book();
//        bookToUpdate.setIsbn("updated54");
//        bookToUpdate.setTitle("updated6title");
//        bookToUpdate.setPublisher("updated6Zysk");
//        bookToUpdate.setType("updated6childs");
//        bookToUpdate.setAuthor("updated6JK Rowling");
//        bookToUpdate.setId(6L);
//        mockBookService.update(bookToUpdate);
//        mockBookService.add(new Book("754", "6title", "6Zysk", "6childs", "6JK Rowling"));
//        mockBookService.findAll().stream()
//                .forEach(System.out::println);
//    }
//}
