# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.computer_detail_computer_id import ComputerDetailComputerId  # noqa: F401,E501
from swagger_server import util


class ComputerDetail(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, computer_id: ComputerDetailComputerId=None):  # noqa: E501
        """ComputerDetail - a model defined in Swagger

        :param computer_id: The computer_id of this ComputerDetail.  # noqa: E501
        :type computer_id: ComputerDetailComputerId
        """
        self.swagger_types = {
            'computer_id': ComputerDetailComputerId
        }

        self.attribute_map = {
            'computer_id': '{computer_id}'
        }
        self._computer_id = computer_id

    @classmethod
    def from_dict(cls, dikt) -> 'ComputerDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The computerDetail of this ComputerDetail.  # noqa: E501
        :rtype: ComputerDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def computer_id(self) -> ComputerDetailComputerId:
        """Gets the computer_id of this ComputerDetail.


        :return: The computer_id of this ComputerDetail.
        :rtype: ComputerDetailComputerId
        """
        return self._computer_id

    @computer_id.setter
    def computer_id(self, computer_id: ComputerDetailComputerId):
        """Sets the computer_id of this ComputerDetail.


        :param computer_id: The computer_id of this ComputerDetail.
        :type computer_id: ComputerDetailComputerId
        """

        self._computer_id = computer_id
