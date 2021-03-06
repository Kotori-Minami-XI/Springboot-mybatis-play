package com.Kotori.controller;

import com.Kotori.domain.Person;
import com.Kotori.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class PersonController {
    @Resource
    private PersonService personService;

    /***
     * Restful风格，需要@PathVariable注明参数
     * http://127.0.0.1:8080/getPerson1/1
     */
    @RequestMapping("/getPerson1/{id}")
    @ResponseBody
    public String getPerson1(@PathVariable Integer id) {
        Person person = personService.getPersonById(id);
        System.out.println(person);
        return person.toString();
    }

    /***
     * 非Restful风格，需要url带上参数
     * http://127.0.0.1:8080/getPerson2?id=1
     */
    @RequestMapping("/getPerson2")
    @ResponseBody
    public String getPerson2(Integer id) {
        Person person = personService.getPersonById(id);
        System.out.println(person);
        return person.toString();
    }

    /***
     * 非Restful风格，@RequestParam("pid")可以让pid映射到id
     * http://127.0.0.1:8080/getPerson3?pid=1
     */
    @RequestMapping("/getPerson3")
    @ResponseBody
    public String getPerson3(@RequestParam("pid") Integer id) {
        Person person = personService.getPersonById(id);
        System.out.println(person);
        return person.toString();
    }

    /***
     * 传输json，用postman模拟
     * {
     *     "personName": "Honoka",
     *     "personAge": 15
     * }
     * http://127.0.0.1:8080/insertPerson1
     */
    @RequestMapping("/insertPerson1")
    @ResponseBody
    public String insertPerson1(@RequestBody Person person) {
        personService.insertPerson(person);
        return person.toString();
    }

    /***
     * 提交表单，用postman模拟
     * http://127.0.0.1:8080/insertPerson2
     */
    @RequestMapping("/insertPerson2")
    @ResponseBody
    public String insertPerson2(Person person) {
        personService.insertPerson(person);
        return person.toString();
    }

}
