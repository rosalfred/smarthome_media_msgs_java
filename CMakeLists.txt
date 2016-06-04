##############################################################################
# CMake
##############################################################################

cmake_minimum_required(VERSION 2.8.3)
project(smarthome_media_msgs_java)

##############################################################################
# Catkin
##############################################################################

find_package(catkin REQUIRED genjava smarthome_media_msgs)

generate_rosjava_messages(
  PACKAGES
    smarthome_media_msgs
)

catkin_package()

##############################################################################
# Installation
##############################################################################

install(DIRECTORY ${CATKIN_DEVEL_PREFIX}/${CATKIN_GLOBAL_MAVEN_DESTINATION}/org/ros/rosjava_messages/
        DESTINATION ${CATKIN_GLOBAL_MAVEN_DESTINATION}/org/ros/rosjava_messages)
