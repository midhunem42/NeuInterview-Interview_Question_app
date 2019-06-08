package com.neuroid.neuinterview.Utility

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.neuroid.neuinterview.model.Question

class AppDBOpenHelper (context: Context,
                       factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME,
        factory, DATABASE_VERSION) {

    var dbLocal: SQLiteDatabase? = null
    override fun onCreate(db: SQLiteDatabase) {
        dbLocal = db
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE  " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_category+ " TEXT," +
                COLUMN_answer + " TEXT," + COLUMN_question + " TEXT" +
                ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
        GenerateQuestionFunction()
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.e("TAG", "Updating table from " + oldVersion + " to " + newVersion);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    private fun GenerateQuestionFunction() {
        addQuestion(Question(1,"HTML5","What is Html","html ===>"))
        addQuestion(Question(1,"CSS3","What is CSS3","CSS3 5 is ===>"))
        addQuestion(Question(1,"BootStrap","What is BootStrap","BootStrap 5 is ===>"))
        addQuestion(Question(1,"JavaScript","What is JavaScript","JavaScript 5 is ===>"))
        addQuestion(Question(1,"jQuery","What is jQuery","jQuery 5 is ===>"))

        addQuestion(Question(1,"TypScript","What is TypScript","TypScript 5 is ===>"))
        addQuestion(Question(1,"NodeJS","What is NodeJS","NodeJS 5 is ===>"))
        addQuestion(Question(1,"ES6","What is ES6","ES6 5 is ===>"))
        addQuestion(Question(1,"ReactJS","What is ReactJS","ReactJS 5 is ===>"))
        addQuestion(Question(1,"MongoDB","What is MongoDB","MongoDB 5 is ===>"))
        addQuestion(Question(1,"AEM","What is AEM","AEM 5 is ===>"))
        addQuestion(Question(1,"Misc","What is Misc","Misc 5 is ===>"))
        AngularQuestions()
        HtmlQuestions()
    }
    private fun HtmlQuestions() {
        addQuestion(Question(1,"HTML5","What is Html5","HTML5 is the latest version of HTML and XHTML with new features like Drawing, Animation, Video and Audio etc. It is used to solve some common structural problems encountered with HTML 4.1. It gives more flexibility to both the web developers, the web designers and enables more exciting and interactive websites in addition to more powerful and efficient applications. The HTML 5 <! doctype html> is recognized by all modern browsers.\n" +
                "\n\n" +
                "HTML5 brings a whole new dimension to the web world. It can embed video on the web-pages without using any special software like Flash. HTML5 is developed in such a way that the developers are not required to waste their time and efforts in creating an error free web page. Firefox, Chrome, Opera, Safari and Internet Explorer all support <! doctype html>."))

        addQuestion(Question(2,"HTML5","Why do we use HTML5?l","The main benefit of HTML5 is that it supports Drawing, Animation, Video and Audio.\n" +
                "\n\n" +
                "The web developers can decrease the complexity and the time to create applications with animations, play music (audio and video), high quality drawings and other rich content using HTML 5 because it can embed video on the web-pages without using any special software like Flash.\n" +
                "\n\n" +
                "HTML5 is far easier for the web designers and the web developers as it tells them how a web page is structured."))
        addQuestion(Question(3,"HTML5","What is DataList Tag in HTML?","A <datalist> tag can be used to create a simple auto-complete feature for a webpage.<datalist> is a newly defined HTML tag that comes with the HTML 5 specification. By using this <datalist> tag, we can define a list of data and then we can bind it with an <input> tag. \n" +
                "\n\n" +
                "A <datalist> tag specifies a list of predefined options for an <input> element. After binding it, the user will see a drop down list in which all the predefined options will be there for the input. When the user types a character or a string, the user will automatically get the data which depends on the input string or a character."))
        addQuestion(Question(4,"HTML5","What is the use of Drag and Drop in HTML5?","Drag and drop is a very common feature and convenient to users. Simply, you need to grab an object and put it at the place you want. This feature is commonly used by many of the online examination websites wherein you have the options to pick up the correct answer, drag it to the answers place holder and drop it."))
        addQuestion(Question(5,"HTML5","What is HTML 5 Web Storage?","HTML5 Web Storage, also known as DOM Storage is a way to preserve state on either the client or server which makes it much easier to work against the stateless nature of HTTP."))
        addQuestion(Question(6,"HTML5","Advantages of HTML5 Web Storage?","1)\tIt can store 5 to 10 MB data. That is far more than what cookies have.\n\n" +
                "2)\tWeb storage data is never transferred with HTTP request, so it increases the performance of the application."))
        addQuestion(Question(7,"HTML5","Web Storage Strengths and Weaknesses ?","Strengths\n" +
                "\n" +
                "\n\tApps can work both online and offline.\n" +
                "\n" +
                "\tAPI is easy to learn and use.\n" +
                "\n" +
                "\tHas the ability to hook in to the browser events such as offline, online and storage change.\n" +
                "\n" +
                "\tHas less overhead than cookies; no extra header data is sent with the browser requests.\n" +
                "\n" +
                "\tProvides more space than what cookies offer so increasingly complex information can be kept.\n" +
                "Weaknesses\n" +
                "\n" +
                "\n" +
                "\tData is stored as a simple string; manipulation is needed to store objects of different types such as Booleans, Objects, Ints and Floats.\n" +
                "\n" +
                "\tIt has a default 5MB limit; more storage can be allowed by the user, if required.\n" +
                "\n" +
                "\tIt can be disabled by the user or systems administrator.\n" +
                "\n" +
                "\tStorage can be slow with the complex sets of data."))
        addQuestion(Question(8,"HTML5","What are the types of Web Storage in HTML5?","There are two types of Web Storage,\n" +
                " \n" +
                "\n" +
                "1)\tSession Storage\n\n" +
                "2)\tLocal Storage"))
        addQuestion(Question(9,"HTML5"," What is Audio Tag in HTML 5?","This new element allows you to deliver audio files directly through the browser, without the need for any plug-ins. The Audio tag is a new tag introduced in HTML5. You can use it to play audio sound like .mp3, wav, and .ogg. I have used five types of sound formats to show which formats are compatible for the browsers. A WAV file is a common sound format that is supported by most browser versions.\n" +
                "\n" +
                "Syntax\n\n" +
                "\n" +
                "<audio src=\"URL\" controls> </audio>"))
        addQuestion(Question(10,"HTML5","What are the features of HTML5 Canvas? ","Flexibility\n" +
                "Interactivity\n\n" +
                "Multimedia Options\n\n" +
                "Animation\n\n" +
                "Platform Support\n\n" +
                "Free and Accessible Dev Tools\n\n" +
                "Code Once, Run Everywhere"))
        addQuestion(Question(11,"HTML5","What is the use of Fieldset tag in HTML5?","The <fieldset> tag groups related form elements. It is like a box. In other words, it draws a box around related elements.\n" +
                "\n" +
                "It must start with a <legend>tag because the <legend> tag defines the title of the field set.\n" +
                "\n\n" +
                "By using the <fieldset>tag and the <legend> tag, you can make your form much easier to understand for the users.\n" +
                "\n" +
                "Syntax\n" +
                "\n\n" +
                "The syntax of the <fieldset> tag in HTML5 is:\n" +
                "\n\n" +
                "<fieldset>Controls</fieldset>"))
        addQuestion(Question(12,"HTML5","Which browsers support HTML5?","The latest versions of Apple Safari, Google Chrome, Mozilla Firefox, and Opera all support many HTML5 features and Internet Explorer 9.0 will also have support for some HTML5 functionality.\n" +
                "\n\n" +
                "The mobile web browsers that come pre-installed on iPhones, iPads, and Android phones all have excellent support for HTML5."))
        addQuestion(Question(13,"HTML5","Is HTML5 backward compatible with old browsers?","Yes! HTML5 is designed, as much as possible, to be backward compatible with existing web browsers. New features build on existing features and allow you to provide fallback content for older browsers.\n" +
                "\n\n" +
                "It is suggested to detect support for individual HTML5 features using a few lines of JavaScript.\n" +
                "\n"))
        addQuestion(Question(14,"HTML5","Are HTML tags case sensitive?","No!"))
        addQuestion(Question(15,"HTML5","What is the purpose of 'section' tag in HTML5?","This tag represents a generic document or application section. It can be used together with h1-h6 to indicate the document structure."))
        addQuestion(Question(16,"HTML5","What is the purpose of 'article' tag in HTML5?","This tag represents an independent piece of content of a document, such as a blog entry or newspaper article."))
        addQuestion(Question(17,"HTML5","What is the purpose of 'aside' tag in HTML5?","This tag represents a piece of content that is only slightly related to the rest of the page.\n" +
                "\n"))
        addQuestion(Question(18,"HTML5","What is the purpose of 'dialog' tag in HTML5?","This tag can be used to mark up a conversation.\n" +
                "\n"))
        addQuestion(Question(19,"HTML5","What is Web Forms 2.0?","Web Forms 2.0 is an extension to the forms features found in HTML4. Form elements and attributes in HTML5 provide a greater degree of semantic mark-up than HTML4 and remove a great deal of the need for tedious scripting and styling that was required in HTML4."))
        addQuestion(Question(20,"HTML5","What is the purpose of datetime-local input control in Web form 2.0?","It represents a date and time (year, month, day, hour, minute, second, fractions of a second) encoded according to ISO 8601 with no time zone information."))
        addQuestion(Question(21,"HTML5","What is the purpose of month input control in Web form 2.0?","It represents a date consisting of a year and a month encoded according to ISO 8601.\n" +
                "\n"))
        addQuestion(Question(22,"HTML5","What is Html","html ===>"))
        addQuestion(Question(23,"HTML5","What is Html","html ===>"))
        addQuestion(Question(24,"HTML5","What is Html","html ===>"))
        addQuestion(Question(25,"HTML5","What is Html","html ===>"))

    }
    private fun AngularQuestions(){
        addQuestion(Question(1,"Angular","What is Angular Framework?","Angular is a TypeScript-based open-source front-end platform that makes it easy to build applications with in web/mobile/desktop. The major features of this framework such as declarative templates, dependency injection, end to end tooling, and many more other features are used to ease the development."))
        addQuestion(Question(2,"Angular","What are the key components of Angular?","Angular has the below key components,\n" +
                "\n\n" +
                "Component: These are the basic building blocks of angular application to control HTML views.\n\n" +
                "1)\tModules: An angular module is set of angular basic building blocks like component, directives, services etc. An application is divided into logical pieces and each piece of code is called as \"module\" which perform a single task.\n\n" +
                "2)\tTemplates: This represent the views of an Angular application.\n\n" +
                "3)\tServices: It is used to create components which can be shared across the entire application.\n\n" +
                "4)\tMetadata: This can be used to add more data to an Angular class."))
        addQuestion(Question(3,"Angular","What are directives?","Directives add behaviour to an existing DOM element or an existing component instance.\n" +
                "\n\n" +
                "import { Directive, ElementRef, Input } from '@angular/core';\n\n" +
                "\n\n" +
                "@Directive({ selector: '[myHighlight]' })\n\n" +
                "export class HighlightDirective {\n\n" +
                "    constructor(el: ElementRef) {\n\n" +
                "       el.nativeElement.style.backgroundColor = 'yellow';\n\n" +
                "    }\n\n" +
                "}\n\n" +
                "Now this directive extends HTML element behavior with a yellow background as below\n" +
                "\n\n" +
                "<p myHighlight>Highlight me!</p>"))

        addQuestion(Question(4,"Angular","What are components?","Components are the most basic UI building block of an Angular app which formed a tree of Angular components. These components are subset of directives. Unlike directives, components always have a template and only one component can be instantiated per an element in a template. Let's see a simple example of Angular component\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   template: ` <div>\n" +
                "      <h1>{{title}}</h1>\n" +
                "      <div>Learn Angular6 with examples</div>\n" +
                "   </div> `,\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Welcome to Angular world';\n" +
                "}"))
        addQuestion(Question(5,"Angular","What is a template?","A template is a HTML view where you can display data by binding controls to properties of an Angular component. You can store your component's template in one of two places. You can define it inline using the template property, or you can define the template in a separate HTML file and link to it in the component metadata using the @Component decorator's templateUrl property. Using inline template with template syntax,\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   template: '\n" +
                "      <div>\n" +
                "         <h1>{{title}}</h1>\n" +
                "         <div>Learn Angular</div>\n" +
                "      </div>\n" +
                "   '\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Hello World';\n" +
                "}\n" +
                "Using separate template file such as app.component.html\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   templateUrl: 'app/app.component.html'\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Hello World';\n" +
                "}"))
        addQuestion(Question(6,"Angular","What is a module?","Modules are logical boundaries in your application and the application is divided into separate modules to separate the functionality of your application. Lets take an example of app.module.ts root module declared with @NgModule decorator as below,\n" +
                "\n" +
                "import { NgModule }      from '@angular/core';\n" +
                "import { BrowserModule } from '@angular/platform-browser';\n" +
                "import { AppComponent }  from './app.component';\n" +
                "\n" +
                "@NgModule ({\n" +
                "   imports:      [ BrowserModule ],\n" +
                "   declarations: [ AppComponent ],\n" +
                "   bootstrap:    [ AppComponent ]\n" +
                "})\n" +
                "export class AppModule { }\n" +
                "The NgModule decorator has three options\n" +
                "\n" +
                "The imports option is used to import other dependent modules. The BrowserModule is required by default for any web based angular application\n" +
                "The declarations option is used to define components in the respective module\n" +
                "The bootstrap option tells Angular which Component to bootstrap in the application"))
        addQuestion(Question(7,"Angular","What are lifecycle hooks available?","Angular application goes through an entire set of processes or has a lifecycle right from its initiation to the end of the application\n\n"+"The description of each lifecycle method is as below,\n" +
                "\n" +
                "1)\tngOnChanges: When the value of a data bound property changes, then this method is called.\n" +
                "2)\tngOnInit: This is called whenever the initialization of the directive/component after Angular first displays the data-bound properties happens.\n" +
                "3)\tngDoCheck: This is for the detection and to act on changes that Angular can't or won't detect on its own.\n" +
                "4)\tngAfterContentInit: This is called in response after Angular projects external content into the component's view.\n" +
                "5)\tngAfterContentChecked: This is called in response after Angular checks the content projected into the component.\n" +
                "6)\tngAfterViewInit: This is called in response after Angular initializes the component's views and child views.\n" +
                "7)\tngAfterViewChecked: This is called in response after Angular checks the component's views and child views.\n" +
                "8)\tngOnDestroy: This is the cleanup phase just before Angular destroys the directive/component."))
        addQuestion(Question(8,"Angular","What is a data binding?","Data binding is a core concept in Angular and allows to define communication between a component and the DOM, making it very easy to define interactive applications without worrying about pushing and pulling data. There are four forms of data binding(divided as 3 categories) which differ in the way the data is flowing.\n" +
                "\n" +
                "1)\tFrom the Component to the DOM: Interpolation: {{ value }}: Adds the value of a property from the component\n" +
                "<li>Name: {{ user.name }}</li>\n" +
                "<li>Address: {{ user.address }}</li>\n" +
                "Property binding: [property]=”value”: The value is passed from the component to the specified property or simple HTML attribute\n" +
                "\n\n" +
                "<input type=\"email\" [value]=\"user.email\">\n\n" +
                "2)\tFrom the DOM to the Component: Event binding: (event)=”function”: When a specific DOM event happens (eg.: click, change, keyup), call the specified method in the component\n" +
                "<button (click)=\"logout()\"></button>\n\n" +
                "3)\tTwo-way binding: Two-way data binding: [(ngModel)]=”value”: Two-way data binding allows to have the data flow both ways. For example, in the below code snippet, both the email DOM input and component email property are in sync\n" +
                "\n<input type=\"email\" [(ngModel)]=\"user.email\">"))
        addQuestion(Question(9,"Angular","What is dependency injection in Angular?","Dependency injection (DI), is an important application design pattern in which a class asks for dependencies from external sources rather than creating them itself. Angular comes with its own dependency injection framework for resolving dependencies( services or objects that a class needs to perform its function).So you can have your services depend on other services throughout your application."))
        addQuestion(Question(10,"Angular","What is the purpose of ngFor directive?","We use Angular ngFor directive in the template to display each item in the list. For example, here we iterate over list of users,\n" +
                "\n" +
                "<li *ngFor=\"let user of users\">\n" +
                "  {{ user }}\n" +
                "</li>\n" +
                "The user variable in the ngFor double-quoted instruction is a template input variable"))
        addQuestion(Question(11,"Angular","What happens if you use script tag inside template?","Angular recognizes the value as unsafe and automatically sanitizes it, which removes the <script> tag but keeps safe content such as the text content of the <script> tag. This way it eliminates the risk of script injection attacks. If you still use it then it will be ignored and a warning appears in the browser console. Let's take an example of innerHtml property binding which causes XSS vulnerability,\n" +
                "\n" +
                "export class InnerHtmlBindingComponent {\n" +
                "  // For example, a user/attacker-controlled value from a URL.\n" +
                "  htmlSnippet = 'Template <script>alert(\"0wned\")</script> <b>Syntax</b>';\n" +
                "}"))
        addQuestion(Question(12,"Angular","What is interpolation?","Interpolation is a special syntax that Angular converts into property binding. It’s a convenient alternative to property binding. It is represented by double curly braces({{}}). The text between the braces is often the name of a component property. Angular replaces that name with the string value of the corresponding component property. Let's take an example,\n" +
                "\n" +
                "<h3>\n" +
                "  {{title}}\n" +
                "  <img src=\"{{url}}\" style=\"height:30px\">\n" +
                "</h3>\n" +
                "In the example above, Angular evaluates the title and url properties and fills in the blanks, first displaying a bold application title and then a URL."))
        addQuestion(Question(13,"Angular","What is the difference between pure and impure pipe?","A pure pipe is only called when Angular detects a change in the value or the parameters passed to a pipe. For example, any changes to a primitive input value (String, Number, Boolean, Symbol) or a changed object reference (Date, Array, Function, Object). An impure pipe is called for every change detection cycle no matter whether the value or parameters changes. i.e, An impure pipe is called often, as often as every keystroke or mouse-move."))
        addQuestion(Question(14,"Angular","What are observables?","Observables are declarative which provide support for passing messages between publishers and subscribers in your application. They are mainly used for event handling, asynchronous programming, and handling multiple values. In this case, you define a function for publishing values, but it is not executed until a consumer subscribes to it. The subscribed consumer then receives notifications until the function completes, or until they unsubscribe."))
        addQuestion(Question(15,"Angular","How can you read full response?","The response body doesn't may not return full response data because sometimes servers also return special headers or status code which which are important for the application workflow. Inorder to get full response, you should use observe option from HttpClient,\n" +
                "\n" +
                "getUserResponse(): Observable<HttpResponse<User>> {\n" +
                "  return this.http.get<User>(\n" +
                "    this.userUrl, { observe: 'response' });\n" +
                "}\n" +
                "Now HttpClient.get() method returns an Observable of typed HttpResponse rather than just the JSON data."))
        addQuestion(Question(16,"Angular","How do you perform Error handling?","If the request fails on the server or failed to reach the server due to network issues then HttpClient will return an error object instead of a successful reponse. In this case, you need to handle in the component by passing error object as a second callback to subscribe() method. Let's see how it can be handled in the component with an example,\n" +
                "\n" +
                "fetchUser() {\n" +
                "  this.userService.getProfile()\n" +
                "    .subscribe(\n" +
                "      (data: User) => this.userProfile = { ...data }, // success path\n" +
                "      error => this.error = error // error path\n" +
                "    );\n" +
                "}\n" +
                "It is always a good idea to give the user some meaningful feedback instead of displaying the raw error object returned from HttpClient.\n" +
                "\n"))
        addQuestion(Question(17,"Angular","What is RxJS?","RxJS is a library for composing asynchronous and callback-based code in a functional, reactive style using Observables. Many APIs such as HttpClient produce and consume RxJS Observables and also uses operators for processing observables. For example, you can import observables and operators for using HttpClient as below,\n" +
                "\n" +
                "import { Observable, throwError } from 'rxjs';\n" +
                "import { catchError, retry } from 'rxjs/operators';"))
        addQuestion(Question(18,"Angular","What is subscribing?","An Observable instance begins publishing values only when someone subscribes to it. So you need to subscribe by calling the subscribe() method of the instance, passing an observer object to receive the notifications. Let's take an example of creating and subscribing to a simple observable, with an observer that logs the received message to the console.\n" +
                "\n" +
                "Creates an observable sequence of 5 integers, starting from 1\n" +
                "const source = range(1, 5);\n" +
                "\n" +
                "// Create observer object\n" +
                "const myObserver = {\n" +
                "  next: x => console.log('Observer got a next value: ' + x),\n" +
                "  error: err => console.error('Observer got an error: ' + err),\n" +
                "  complete: () => console.log('Observer got a complete notification'),\n" +
                "};\n" +
                "\n" +
                "// Execute with the observer object and Prints out each item\n" +
                "myObservable.subscribe(myObserver);\n" +
                "// => Observer got a next value: 1\n" +
                "// => Observer got a next value: 2\n" +
                "// => Observer got a next value: 3\n" +
                "// => Observer got a next value: 4\n" +
                "// => Observer got a next value: 5\n" +
                "// => Observer got a complete notification"))
        addQuestion(Question(19,"Angular","What is an observable?","An Observable is a unique Object similar to a Promise that can help manage async code. Observables are not part of the JavaScript language so we need to rely on a popular Observable library called RxJS. The observables are created using new keyword. Let see the simple example of observable,\n" +
                "\n" +
                "import { Observable } from 'rxjs';\n" +
                "\n" +
                "const observable = new Observable(observer => {\n" +
                "  setTimeout(() => {\n" +
                "    observer.next('Hello from a Observable!');\n" +
                "  }, 2000);\n" +
                "});\n"))
        addQuestion(Question(20,"Angular","What is an observer?","Observer is an interface for a consumer of push-based notifications delivered by an Observable. It has below structure,\n" +
                "\n" +
                "interface Observer<T> {\n" +
                "  closed?: boolean;\n" +
                "  next: (value: T) => void;\n" +
                "  error: (err: any) => void;\n" +
                "  complete: () => void;\n" +
                "}\n" +
                "A handler that implements the Observer interface for receiving observable notifications will be passed as a parameter for observable as below,\n" +
                "\n" +
                "myObservable.subscribe(myObserver);\n" +
                "Note: If you don't supply a handler for a notification type, the observer ignores notifications of that type"))
        addQuestion(Question(21,"Angular","What is the short hand notation for subscribe method?","The subscribe() method can accept callback function definitions in line, for next, error, and complete handlers is known as short hand notation or Subscribe method with positional arguments. For example, you can define subscribe method as below,\n" +
                "\n" +
                "myObservable.subscribe(\n" +
                "  x => console.log('Observer got a next value: ' + x),\n" +
                "  err => console.error('Observer got an error: ' + err),\n" +
                "  () => console.log('Observer got a complete notification')\n" +
                ");"))
        addQuestion(Question(22,"Angular","What is metadata rewriting?","Metadata rewriting is the process in which the compiler converts the expression initializing the fields such as useClass, useValue, useFactory, and data into an exported variable, which replaces the expression. Remember that the compiler does this rewriting during the emit of the .js file but not in definition files( .d.ts file)."))
        addQuestion(Question(23,"Angular","What is zone?","A Zone is an execution context that persists across async tasks. Angular relies on zone.js to run Angular's change detection processes when native JavaScript operations raise events"))


    }


    fun addQuestion(question: Question) {
        val values = ContentValues()
        values.put(COLUMN_category, question.category)
        values.put(COLUMN_answer,question.answer)
        values.put(COLUMN_question,question.question)
        dbLocal!!.insert(TABLE_NAME, null, values)
    }


    fun getQuestionsByCategory(category:String):ArrayList<Question>?{
       dbLocal = this.readableDatabase
        val query = "SELECT * FROM $TABLE_NAME WHERE $COLUMN_category = \"$category\""
        val cursor = dbLocal!!.rawQuery(query, null)
        val questions= ArrayList<Question>()
        cursor!!.moveToFirst()

        val id1 = Integer.parseInt(cursor.getString(0))
        val ca1 =cursor.getString(1)
        val question1 = cursor.getString(3)
        val answer1 = cursor.getString(2)

        val q = Question(id1,ca1,question1,answer1)

        questions.add(q)
        while (cursor.moveToNext()) {
            val id = Integer.parseInt(cursor.getString(0))
            val ca =cursor.getString(1)
            val question = cursor.getString(3)
            val answer = cursor.getString(2)
            val q1 = Question(id,ca,question,answer)
            questions.add(q1)
        }
        cursor.close()
        return questions
    }

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "neuInterview.db"
        val TABLE_NAME = "neuInterview"
        val COLUMN_ID = "_id"
        val COLUMN_category = "category"
        val COLUMN_question = "question"
        val COLUMN_answer = "answer"
    }
}