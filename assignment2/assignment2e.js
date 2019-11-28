var todayDate = new Date();
                var days = [`sun`,`mon`,`tue`,`wed`,`thurs`,`fri`,`sat`];
                var months = [`Jan`,`Feb`,`Mar`,`Apr`,`May`,`Jun`,`July`,`Aug`,`sept`,`Oct`,`Nov`,`Dec`];
                console.log(todayDate.getDate()+`-`+months[todayDate.getMonth()]+`-`+todayDate.getFullYear()+`-`+days[todayDate.getDay()]);
                console.log(`=====================================`);
                
                
                console.log(Math.random()*100);