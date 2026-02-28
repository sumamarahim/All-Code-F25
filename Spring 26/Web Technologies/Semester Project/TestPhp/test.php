<?php
echo "<h1>Good morning</h1>";
echo "<p>Today we learned something new</P";

echo "<style>
ol {
    list-style-type: decimal;
    margin-left: 40px;
    }
</style>";
echo "<ol>";
for ($i = 1; $i <=10; $i++) {
    echo "<li>item " . $i. "</li>";
}
echo "</ol>";

?>