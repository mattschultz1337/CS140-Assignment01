
<div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">Assignment 1--due Friday September 1, 11:59pm</h1>

<div class="post_region_text" id="questionText"><p>This is a lot about writing classes with <strong>private</strong> fields, constructors, <em>getter</em> and <em>setter</em> methods, plus a couple of other methods and representation of objects when the program is running.</p>
<p>&nbsp;</p>
<p>All the classes are the package&nbsp;<tt>assignment01</tt>.&nbsp;All four classes <tt>Class</tt>, <tt>Person</tt>, <tt>Student</tt>, and <tt>Driver</tt> are <strong>public</strong> classes, each one in its own file (<tt>Class.java</tt>,<tt> Person.java</tt>,<tt> Student.java</tt>, and<tt> Driver.java</tt>)<strong> <br></strong></p>
<p>&nbsp;</p>
<p>The assignment is due Friday September 1, 11:59pm</p>
<p>&nbsp;</p>
<p>Create a public class&nbsp;<tt>Class</tt>, which represents something like&nbsp;CS140, Programming with Objects.</p>
<p>&nbsp;</p>
<p>All the fields are&nbsp;<strong>private</strong>: two of type <tt>String</tt> called&nbsp;<tt>name</tt>&nbsp;and&nbsp;<tt>number</tt>; two of type <tt>int</tt> called&nbsp;<tt>crn</tt> and&nbsp;<tt>numCredits</tt>; one <tt>double</tt> called&nbsp;<tt>qualPoints</tt>. Our example of&nbsp;<tt>number</tt>&nbsp;is "CS140",&nbsp;<tt>name</tt>&nbsp;is "Programming with Objects",&nbsp;<tt>numCredits</tt>&nbsp;is 4 and&nbsp;<tt>crn</tt>&nbsp;is 10390.</p>
<p>&nbsp;</p>
<p>Provide a <em>constructor</em> that has 4 parameters to set the values of all the fields except <tt>qualPoints</tt>:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="typ">Class</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> aName</span><span class="pun">,</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> aNumber</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> aNumCredits</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> aCrn</span><span class="pun">){</span><span class="pln">
</span><span class="com">//TO DO</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>For example, in the TO DO, you have the instruction:&nbsp;<tt>name = aName;</tt></p>
<p>&nbsp;</p>
<p>In this class, add a public class-constant of type&nbsp;<tt>Class</tt>&nbsp;to represent a dummy Class:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">final</span><span class="pln"> </span><span class="typ">Class</span><span class="pln"> DUMMY_CLASS</span></pre>
<p>&nbsp;</p>
<p>and in the same declaration, instantiate DUMMY_CLASS as a <em>new</em> <tt>Class</tt> using arguments "Dummy", "000", 0 and 0.</p>
<p>&nbsp;</p>
<p>Write public&nbsp;<em>getter</em>&nbsp;methods for&nbsp;<em>all</em>&nbsp;the fields, for example</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="pln">publicString getName</span><span class="pun">(){</span><span class="pln">
&nbsp;&nbsp;&nbsp; </span><span class="kwd">return</span><span class="pln"> name</span><span class="pun">;</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>Write a&nbsp;<em>setter</em>&nbsp;method for&nbsp;<tt>qualPoints</tt>:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> setQualPoints</span><span class="pun">(</span><span class="kwd">double</span><span class="pln"> qPoints</span><span class="pun">){</span><span class="pln">
&nbsp;&nbsp;&nbsp;&nbsp; qualPoints </span><span class="pun">=</span><span class="pln"> qPoints</span><span class="pun">;</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>Next create a shorter <em>class</em> called&nbsp;<tt>Person</tt>. There are three <strong>private</strong> fields: two <tt>String</tt>s&nbsp;<tt>lastName</tt> and&nbsp;<tt>firstName</tt>&nbsp;and a <tt>char</tt> called&nbsp;<tt>middleInitial.</tt></p>
<p>&nbsp;</p>
<p>Provide a <em>constructor</em> with three parameters to set all three fields&nbsp;and provide <em>getter</em> methods for each of the three fields.</p>
<p>&nbsp;</p>
<p>Now create a <em>class</em>&nbsp;<tt>Student</tt>. The private fields are&nbsp;<tt>self</tt>&nbsp;of type&nbsp;<tt>Person</tt>&nbsp;and four&nbsp;<tt>Class</tt>&nbsp;fields <tt>class1</tt>,&nbsp;<tt>class2</tt>,&nbsp;<tt>class3</tt>,&nbsp;<tt>class4</tt>, all initialized to equal&nbsp;<tt>Class.DUMMY_CLASS</tt>.</p>
<p>&nbsp;</p>
<p>Include four <tt>setter</tt> methods that are actually&nbsp;<em>delegate</em>&nbsp;methods(we will explain this in class in the future), the first is</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> setQualPoints1</span><span class="pun">(</span><span class="kwd">double</span><span class="pln"> qPoints</span><span class="pun">){</span><span class="pln">
&nbsp; class1</span><span class="pun">.</span><span class="pln">setQualPoints</span><span class="pun">(</span><span class="pln">qPoints</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>then add 3 more:&nbsp;<tt>setQualPoints2</tt>&nbsp;for&nbsp;<tt>class2</tt>,&nbsp;<tt>setQualPoints3</tt>&nbsp;for&nbsp;<tt>class3</tt>, and <tt>setQualPoints4</tt>&nbsp;for&nbsp;<tt>class4</tt>. Provide a method&nbsp;<tt>public String getName()</tt>&nbsp;that returns the concatenation of the<tt> firstName, middleInitial</tt> and<tt> lastName</tt> of&nbsp;self. For example, "John", 'E', "Jones" should be joined using + and space " ", or period-space ". " to get "John E. Jones".</p>
<p>&nbsp;</p>
<p>Provide a <em>constructor</em> that just has one&nbsp;<tt>Person</tt>&nbsp;parameter to set the value of&nbsp;<tt>self</tt>.</p>
<p>&nbsp;</p>
<p>Provide&nbsp;<em>getter</em>&nbsp;and&nbsp;<em>setter</em>&nbsp;methods for the four <tt>class1</tt> through <tt>class4</tt> fields.</p>
<p>&nbsp;</p>
<p>Provide a method&nbsp;<tt>public double computeSemesterGPA()</tt>, which declares a local double variable&nbsp;<tt>gpa</tt>&nbsp;initially 0.0, and computes the sum<tt>&nbsp;totalPoints</tt>&nbsp;of the&nbsp;<tt>qualPoints</tt>&nbsp;of the 4 variables of type <tt>Class</tt> and the sum&nbsp;<tt>totalCredits</tt>&nbsp;of the credits of the 4 variables of type Class. If <tt>totalCredits &gt; 0</tt>,&nbsp;then set&nbsp;<tt>gpa</tt>&nbsp;to&nbsp;<tt>totalPoints / totalCredits</tt>&nbsp;and return&nbsp;<tt>gpa</tt>.</p>
<p>&nbsp;</p>
<p>Write a class<tt>&nbsp;Driver</tt>&nbsp;with the&nbsp;<tt>main</tt>&nbsp;method for the assignment. In the <tt>main</tt> method, create 3 <tt>Person</tt> objects and use them to create 3 <tt>Student</tt> objects, each with one of the three different <tt>Person</tt> objects as&nbsp;<tt>self.</tt> In one <tt>Student</tt>, leave the fields of type<tt> Class</tt> fields unchanged. In the second make three objects of type Class and set three of the fields of type <tt>Class</tt> of the <tt>Student</tt> to those new ones. For the third <tt>Student</tt>, create 4 objects of type <tt>Class</tt> and set the four fields of type <tt>Class</tt> in the third student to those four <tt>Class</tt> objects. Go through all the 7 <tt>Class</tt> objects and set the&nbsp;<tt>qualPoints</tt>&nbsp;for each. The quality points for a course is computed as follows: first A = 4.0, A- = 3.7, B+ = 3.3, B = 3.0, B- = 2.7, C+ = 2.3, C = 2, C- = 1.7, D = 1, F = 0, (this program does not handle P grades since we need to separately store "gpa credits") and then the quality points is&nbsp;<tt>numCredits</tt>&nbsp;times the numeric value of the letter grade. For example, if you got B- in a 3 credit course, the <tt>qualPoints</tt>&nbsp;for that course would be 8.1.</p>
<p>&nbsp;</p>
<p>Print the&nbsp;<tt>gpa</tt>&nbsp;for each of the students and print the expected value on a separate line. You can use&nbsp;println&nbsp;or&nbsp;printf&nbsp;but for&nbsp;printf, the&nbsp;gpa&nbsp;needs 3 decimal places.</p>
<p>&nbsp;</p>
<p>Figure 1, linked below shows the memory diagram a student with all filed of type Class equal to a single <strong>dummy courses shared by all four class fields.</strong> For the the third Student that has 4 real courses complete Figure 2 with the values that you chose in your Driver program. Either do it by hand or use the Microsoft Vizio file.</p>
<p>&nbsp;</p>
<p><strong>Figure 1: Memory Diagram of the as a PDF: </strong><a href="http://www.cs.binghamton.edu/~lander/cs140/201620/Visio-Assignment01.pdf" target="_blank" rel="noreferrer"><strong>http://www.cs.binghamton.edu/~lander/cs140/201620/Visio-Assignment01.pdf</strong></a></p>
<p><strong></strong></p>
<p><strong>FIGURE 2: Memory Diagram with blank entries as a PDF for the 4 different fields of type Class </strong><a href="http://www.cs.binghamton.edu/~lander/cs140/201620/Visio-Assignment01Solution.pdf" target="_blank" rel="noreferrer"><strong>http://www.cs.binghamton.edu/~lander/cs140/201620/Visio-Assignment01Solution.pdf</strong></a></p>
<p><strong></strong></p>
<p><strong>Viso 2016 source file (with blank entries):</strong><a href="http://www.cs.binghamton.edu/~lander/cs140/201620/Assignment01Solution.vsdx" target="_blank" rel="noreferrer"><strong>http://www.cs.binghamton.edu/~lander/cs140/201620/Assignment01Solution.vsdx</strong></a></p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'assignment1'});return false;">assignment1</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>
<div class="post_region_message_wrapper">
  <div id="endorse_text"></div>
  
  
  

      </div>
    </div>
