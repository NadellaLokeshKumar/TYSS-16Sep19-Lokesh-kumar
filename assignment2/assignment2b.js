console.log(`function Expression`);
        var f = function(num){
            var fact = 1;
        while(num!=0){
            fact = num*fact;
            num--;
        }
        console.log(`factorial=`,fact)
        }
        f(5);
        console.log(`---------------------------------------`);
        var fib = function(num){
            var a = 0,b = 1,sum = 0; 
             console.log(a);
             console.log(b);
         for(var i=1;i<=num-2;i++){
             sum = a+b;
            console.log(sum);
            a = b;
            b = sum;
             }
          }
          fib(7);
          console.log(`---------------------------------------`);
          var cir = function(rad){
            console.log(`Radius =`,2*3.14*rad);
        }
        cir(2);
        console.log(`---------------------------------------`);
        var arrAdd = function(){
            var a = [10,20,30,40];
            var sum = 0;
            for(var i=0;i<a.length;i++){
                sum = sum+a[i];
            }
            console.log(`Array elements sum=`,sum);
        }
        arrAdd();
        console.log(`---------------------------------------`);
        var primeNum = function(num){
            var count=0;
            for(var i=1;i<=num;i++){
            if(num%i === 0)
                count++;
            }
            if(count === 2)
            console.log(`prime number`);
            else
            console.log(` Not a prime number`);
          }
          primeNum(7);
          console.log(`---------------------------------------`);