import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

public class RandomATronController {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students, "Paul", "Andrew", "Patrick", "Daniel", "Sarah", "Kelsie", "Liam", "Ed", "Scott", "Lyle", "Stuart", "Connor", "Fraser", "Callum", "Chris", "Ruaridh", "Nikhil", "Roberto", "Brian");

        RandomATron randomATron = new RandomATron(students);


        get("/randomatron", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("students", randomATron.getStudents());
            model.put("template", "home.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/one", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("singleName", randomATron.randomName());
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/two", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("pair", randomATron.randomPair());
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        post("/randomatron", (req, res) -> {
            String name = req.queryParams("name");
            randomATron.addStudent(name);
            res.redirect("/randomatron");
            return "";
        });

        post("/randomatron/delete", (req, res) -> {
            String name = req.queryParams("name");
            randomATron.removeStudent(name);
            res.redirect("/randomatron");
            return "";
        });

    }





}
