# climate-game

A game about avoiding climate catastrophe.

## Documentation

There is documentation [here](https://simon-brooke.github.io/climate-game/).

## Warning

At this stage nothing works. This isn't even a skeleton of a working game; it's a repository in which to develop a specification, and from that a skeleton.

## Policy on collaboration and forking

I'm much better at starting projects than finishing them. It would be far better if there were half a dozen slightly different more or less playable variants of this game than if there were none. It would, obviously, be better still if there were just one, more or less finished, reasonably polished version. But in general my policy is that you are free to, and encouraged to, fork this code. I'd appreciate it if you would communicate with me, and occasionally push me merge requests, but...

## Usage

At present, you can run from the REPL by invoking

> lein repl

This allows you to play around with the code. Alternatively you can build an executable JAR file by invoking

> lein uberjar

This will build a jar file in `target/uberjar/climate-game-0.1.0-SNAPSHOT-standalone.jar`; this file may be run by invoking

> java -jar target/uberjar/climate-game-0.1.0-SNAPSHOT-standalone.jar

However, currently all you'll get is a window with a rendering of a planet -- not even the right planet -- in it. Nothing yet works.

## License

Copyright © 2021 Simon Brooke

This program and the accompanying materials are made available under the
GNU General Public License as published by the Free Software Foundation, 
either version 2 of the License, or (at your option) any later version, 
with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
