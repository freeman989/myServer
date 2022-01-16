package com;

//import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import io.swagger.annotations.Api;


@RestController
@RequestMapping("/")
//@Api(tags = "Api methods")
public class ControllerRest {

    @GetMapping()
    public ModelAndView simpleController(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/swagger")
//    @ApiOperation(value = "Метод приветствует Swagger")
    public ResponseEntity<String> swaggerController(){
        return ResponseEntity.ok().body("Hello Swagger!");
    }

}
