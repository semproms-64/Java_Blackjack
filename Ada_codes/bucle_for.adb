with Ada.Text_IO;
use Ada.Text_IO;

procedure bucle_for is
i : Integer := 0;
begin
   for i in 1..10 loop
      Put_Line ("i has value " & i'Img & "!");
   --i'Img is the way to transform an integer variable into a string in ADA
   end loop;
end bucle_for;