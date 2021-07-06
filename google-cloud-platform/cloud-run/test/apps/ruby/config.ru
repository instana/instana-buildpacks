require 'bundler/setup'
Bundler.require

require 'rack/lobster'
run Rack::Lobster.new
