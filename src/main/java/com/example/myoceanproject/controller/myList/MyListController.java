package com.example.myoceanproject.controller.myList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myList/*")
public class MyListController {
    // 내가 쓴 일기 페이지
    @GetMapping("/myDiary")
    public String mydiary(){
        return "app/myList/myDiary";
    }

    // 내가 보낸 교환일기 페이지
    @GetMapping("/myExchangeDiary")
    public String myexchangediary(){
        return "app/myList/myExchangeDiary";
    }

    // 카테고리 ( 합치는 부분!)
    @GetMapping("/myListCategory")
    public String mylistcategory(){
        return "app/myList/myList";
    }

    //  책 이야기
    @GetMapping("/myListBook")
    public String mylistbook(){
        return "app/myList/myListBookBoard";
    }

    //  요리 이야기
    @GetMapping("/myListCook")
    public String mylistcook(){
        return "app/myList/myListCookBoard";
    }

    //  고민상담
    @GetMapping("/myListCounseling")
    public String mylistcounseling(){
        return "app/myList/myListCounselingBoard";
    }

    //  운동 이야기
    @GetMapping("/myListExercise")
    public String mylistexercise(){
        return "app/myList/myListExerciseBoard";
    }

    // 자유게시판
    @GetMapping("/myListFree")
    public String mylistfree(){
        return "app/myList/myListFreeBoard";
    }

    // 영화이야기
    @GetMapping("/myListMovie")
    public String mylistmovie(){
        return "app/myList/myListMovieBoard";
    }

    // 게시글 없는 페이지 표시할때!
    @GetMapping("/myListNocontents")
    public String mylistnocontents(){
        return "app/myList/myListNoContents";
    }

    // 내가 쓴 게시글 (전체)
    @GetMapping("/myListTotal")
    public String mylisttotal(){
        return "app/myList/myListTotal";
    }



}
