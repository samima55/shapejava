
<?php 

  function meow($string , $collback){
      $result =array(
	     'upper'=>strtoupper($string),
		 'lower'=>strtolower($string)
	      );
		  
		  if(is_callable($collback)){
		     call_user_func($collback,$result);
		  
		  }
	  }
  
  
      meow('samima',function($name){
	      echo $name['upper'];
	  
	  });
	  
	  echo "<br><br>";
	  $json_array= array("samima"=>40, "halima"=>50);
	       $json_save=json_encode($json_array);
	     echo json_encode($json_array);
              
		      echo "<br><br>";
		 var_dump(json_decode($json_save));
		  $arr_to_jst=json_decode($json_save);
		 echo "<br><br>";
		 echo  $arr_to_jst->samima; echo "<br><br>";
		 echo  $arr_to_jst->halima;
		 ?>
		 
		 
		<?php

     class dog{
		 const welcome ="WELCOME to dog class";
		 public $name;
		 public $age;
         function  __construct($name, $age){
			 $this->name=$name;
			 $this->age=$age;
			 
		 }
        function get_name(){
		  return $this->name;
		}
		
		//this will displayed at the end of the script 
		function __destruct(){
			echo "<br><br>the dog name is $this->name and the age is $this->age <br>";
		}	 
		
		function tostring(){
		 echo " this is the :: i was always lookign for ";
		}
		
		function call_to_string_inside_the_class(){
		    self :: tostring();
		
		}
	 }
	    $d =new dog("fonza",12);
		print_r($d);
		 var_dump($d);
		    echo "<br><br>";
		 echo dog :: welcome;
		   echo "<br><br>";
	       dog :: tostring();
		    echo "<br><br>";
		    dog :: call_to_string_inside_the_class();
		 ?>
		 
		
		 
		<?php
		
		    function print_it( iterable $arr){
				foreach($arr as $ar){
					echo $ar;
				}
			}
		       echo "<br><br>";
			 $ar=["a","b","c"];
			 print_it($ar);
			 
			           function getIterable():iterable {
               return ["a", "b", "c"];
                                 }

                      $myIterable = getIterable();
                       foreach($myIterable as $item) {
                   echo $item;
                      }
			 
		  
		 