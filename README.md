![Build](https://github.com/edejin/Emmet-Everywhere/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/7450-emmet-everywhere.svg)](https://plugins.jetbrains.com/plugin/7450-emmet-everywhere)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/7450-emmet-everywhere.svg)](https://plugins.jetbrains.com/plugin/7450-emmet-everywhere)


Old version https://github.com/edejin/EmmetEverywhere

<!-- Plugin description -->

EmmetEverywhere Plugin for IntelliJ IDEA
========================================

Use HTML Emmet anywhere.

For example in Google Closure Template (*.soy files).

Just type your code and press `CTRL+ALT+]`

Here’s an example: this abbreviation

`#page>div.logo+ul#navigation>li*5>a{Item $}`

...can be transformed into

```html
<div id="page">
  <div class="logo"></div>
  <ul id="navigation">
    <li><a href="">Item 1</a></li>
    <li><a href="">Item 2</a></li>
    <li><a href="">Item 3</a></li>
    <li><a href="">Item 4</a></li>
    <li><a href="">Item 5</a></li>
  </ul>
</div>
```

more information about Emmet:

http://emmet.io/
<!-- Plugin description end -->
