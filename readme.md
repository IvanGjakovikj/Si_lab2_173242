### НЕМАМ ИСКУЦАНО ТЕСТОВИ !!!

Втора лабораториска вежба по Софтверско инженерство

Иван Ѓаковиќ , бр. на индекс 173242

Control flow graph 

![screenshot](Graph.jpg)

Цикломатската Комплексност 

Цикломатската комплексност на овој код е 8 , истата ја добив преку формулата 
P+1 , каде што P е бројот на предикатни јазли. Во случајов P = 7 , па цикломатската комплексност изнесува 8.

Тест случаи според критериумот Multiple Condition

if (hr < 0 || hr > 24) 
TX || FT || FF

if (min < 0 || min > 59) 
TX || FT || FF

if (sec >= 0 && sec <= 59) 
TT TF FX

else if (hr == 24 && min == 0 && sec == 0)
TTT TTF FXX TFX

Тест случаи според критериумот C1 - Every Branch
Вкупно се: 6.

12h 39m 44s  (Во јазол I одлучува дека условот е точен според 12h па оди во K каде очигледно условот не проаѓа па оди во 10 па во for назад , каде гледа дека нема други листи па го исполнуува D ,D.1)
 
00h 39m 44s  (Во јазол I условот паѓа саатите не се ни помали а ни поголеми од 0 па така оди во J таму влага во условот па оди во N во N проаѓа па O па D.2)

00h 00m 62s  (--||-- стигаме во јазол N , не влагаме таму , продужува во P , таму паѓа оди во Q па во D.2 ...)

-1h 22m 22s  ( -- || -- стигаме во K од таму саатите се помали од 0 па продужува во M па D.2 --||--)

24h 24m 21s  ( на овој начин ке стигнеме до јазол R и условот ке падне скока на else т.е јазол T па D.2 и се враќа у фор.)

24h 00m 00s	(--||-- ќе стигне до R и таму ке пројде влага во условот , па S па 2.3)
