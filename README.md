![Preview image of the main visualisation for NHS-spend.dashboard](server/public/images/site_preview.png "NHS-spend.dashboard")

# NHS-spend.dashboard

A data dashboard for NHS spending data.

The build supports Scala.js for frontend scripting, slick for database access, and scss compilation.

The project can be compiled with sbt, and produces a .deb install archive. This installs the webserver as a service that
requires a reverse-proxy such as nginx to be served on port 80 to the web.

No licenses are provided to redistribute the code, please contact the authors for a license if you wish to do so.
The site scaffold will be freely available soon, at https://github.com/ianknowles/graphing-app-scaffold.

## Development environment
See [development.md](docs/development.md) for instructions on setting up a local development environment.
